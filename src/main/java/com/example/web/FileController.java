package com.example.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class FileController {

	// path라는 변수에 servlet-context에 저장한 uploadPath 주소 입력
	@Resource(name = "uploadPath")
	private String path;

	@ResponseBody
	@RequestMapping(value = "upload", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String upload(MultipartFile file) throws Exception {

		System.out.println(file.getOriginalFilename());

		// upload를 실행하면 file 데이터를 받아서
		String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());
		// file에 있는 오리지널 이름(저장한이름), 파일의 정보를 받아서 실행한것을 savedName이라는 변수로 보내서 리턴 =
		// 데이터로 저장됨
		return savedName;
	}

	// 이미지 파일 출력 = 파일 이름을 받아서 이미지 데이터로 리턴(display?fileName=(저장된 파일이름))
	@ResponseBody
	@RequestMapping("/display")
	public byte[] display(String fileName) throws Exception {
		InputStream in = new FileInputStream(path + "/" + fileName);
		byte[] image = IOUtils.toByteArray(in);
		in.close();
		return image;
	}

	// 파일삭제
	@ResponseBody
	@RequestMapping(value = "deleteFile", method = RequestMethod.POST)
	public void deleteFile(String fileName) {
		System.out.println(fileName);
		new File(path + "/" + fileName).delete();
	}

	// 파일 업로드 매소드
	// 지정된 패스에 새로운 겹치지않는 이름으로 파일의 데이터와 새로운 이름을 가지고 패스에 저장하는 매소드
	private String uploadFile(String originalName, byte[] filedata) throws Exception {
		// 저장할 오리지널 파일이름받고, 파일의 데이터를 받음
		UUID uid = UUID.randomUUID();
		// uid를 랜덤한 아이디로 변환시켜줘서 변경(유니크하게 이름을 줘서 겹치지 않도록) = 유효아이디
		String savedName = uid.toString() + "_" + originalName;

		File target = new File(path, savedName); // 파일 저장소(path)에 savedName을 저장
		FileCopyUtils.copy(filedata, target);// copy = 서버에 업로드 함

		return savedName;
	}

	//다운로드 매소드
	@ResponseBody
	@RequestMapping(value = "downloadFile")
	public ResponseEntity<byte[]> downloadFile(String fileName) throws Exception {
		System.out.println("파일이름:" + fileName);
		ResponseEntity<byte[]> entity = null;
		InputStream in = null;
		try {
			HttpHeaders headers = new HttpHeaders();
			in = new FileInputStream(path+ "/" + fileName);
			fileName = fileName.substring(fileName.indexOf("_") + 1);
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.add("Content-Disposition",
					"attachment;filename=\"" + new String(fileName.getBytes("UTF-8"), "ISO-8859-1") + "\"");
			entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e.toString());
			entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
		} finally {
			in.close();
		}
		return entity;
	}
}
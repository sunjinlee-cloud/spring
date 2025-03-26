package com.simple.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/request") //모든 메서드 요청경로앞에 /request가 붙는다.
public class RequestController {
//	//ex01 화면요청
//	@RequestMapping("/ex01")
//	public String ex01() {
//		return "request/ex01";
//	}
	
	//void형으로도 연결 가능하며, 이 경우 들어온 요청경로 그대로 나가는 경로가 된다. 많이 쓰지는 않음
	@RequestMapping("/ex01")
	public void ex01() {
	}
	
	//@RequestMapping(value = "/basic01", method=RequestMethod.GET)
	//@RequestMapping(value = "/basic01", method=RequestMethod.POST)
	//@RequestMapping(value = "/basic01") // get, post 둘다 허용
	//@GetMapping("/basic01")//get요청만 허용하는 리퀘스트매핑과 같다.
	//@PostMapping("/basic01")//post요청만 허용하는 리퀘스트매핑과 같다.
	public void basic01() {
		System.out.println("basic01 요청 들어옴");
	}
	
	//value는 배열타입이므로 배열을 넣을 수 있따.
	//동일한 곳으로 보내는 요청이 여러 개 있을 경우 요청을 {}로 묶어서 사용 가능
	//이 경우 void형이기 때문에 basic02로 들어오면 basic02로 나가고 03도 마찬가지로 03으로 나감.
	@RequestMapping({"/basic02", "/basic03"})
	public void basic02() {
		System.out.println("basic02 - 03요청 실행");
	}
	
	@RequestMapping("/ex02")
	public String ex02() {
		return "request/ex02";
	}
	
	//@RequestMapping(value="/param", method=RequestMethod.POST)
	//public String param(HttpServletRequest request) {
		
		//jsp에서 한 방법
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		String[] inter = request.getParameterValues("inter");
//		System.out.println(id);
//		System.out.println(Arrays.toString(inter));
		//return "request/ex02_success";
	//}
	
	//@RequestParam 애너테이션으로 단일값 받기
	//@RequestParam 은 클라이언트에서 반드시 값을 넘겨야 하고 null이 넘어오면 오류남.
	//값을 받지 못하더라도 오류가 나지 않게 하려면 required를 써야됨.
	//required = false 해주고 defaultValue를 넣어주면 값이 넘어오지 않았을 때의 기본값을 정해줄 수 있음
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(@RequestParam("id") String id,
//						@RequestParam("pw") String pw,
//						@RequestParam("name") String name,
//						@RequestParam(value="inter", required=false, defaultValue="") String[] inter) {
//		//id값을 받아서 스트링 id에 넣어달라는 뜻임
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(name);
//		System.out.println(Arrays.toString(inter));
//
//		return "request/ex02_success";
//	}
	
	
	@RequestMapping(value="/param", method=RequestMethod.POST)
	public String param(MemberVO vo) {
		//id값을 받아서 스트링 id에 넣어달라는 뜻임
		System.out.println(vo.toString()); 

		return "request/ex02_success";
	}
	
	
	@RequestMapping("/req_quiz01")
	public void req_quiz01() {
		
	}
	
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String login(@RequestParam("id") String id,
//						@RequestParam("pw") String pw) {
//		System.out.println(id);
//		System.out.println(pw);
//		
//		if (id.equals("abc123") && pw.equals("xxx123")) {
//			return "request/req_quiz01_ok";
//		} else {
//			return "request/req_quiz01_no";
//		}
//	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(MemberVO vo) {
		if (vo.getId().equals("abc123") && vo.getPw().equals("xxx123")) {
			return "request/req_quiz01_ok";
		} else {
			return "request/req_quiz01_no";
		}
	}
	
	
	
}
 
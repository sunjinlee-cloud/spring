package com.simple.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	@Autowired(required = false) 
	//required = false는 만약 적합한 빈이 없는 경우에는 빈 연결 안하고 넘어간다는 뜻
	//물론 연결 안했는데 밑에서 사용이 된다면 에러가 나긴 할것이다.
	@Qualifier("doc2")
	private Document document;
	
	/*Printer 객체 생성시 적합한 bean 객체를 자동으로 주입해준다.
	 * 먼저 type으로 찾고 그 다음에 이름으로 찾는다. 
	 * 
	 * 이 애너테이션을 멤버변수에 써도, 세터, 게터에 써도 생성자에 쓴 것과 효과가 같다.
	 * @Qualifier : 같은 type이 2개일때 맞출 이름을 적어준다. 단독사용은 안된다.
	 * 
	 * @resource  
	 * @inject  
	 * 
	 */
	
	public Printer() {
	}
	
	public Printer(Document document) {
		super();
		this.document = document;
	}


	public Document getDocument() {
		return document;
	}
 
	public void setDocument(Document document) {
		this.document = document;
	}
	
	
}

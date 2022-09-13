package com.springboot.project.repository;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.project.model.Pdboard;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PdRepositoryTests {

	@Autowired
	private PdRepository pdboardRepo;
	
	@Test
	public void inspect() {
		// 실제 객체의 클래스를 생성합니다.
		Class<?> clz = pdboardRepo.getClass();
		// 실행 결과를 보면 실제 클래스가 com.sun.proxy...로 시작하는 것을 볼 수 있습니다.
		// 클래스의 이름의 com.sun.proxy로 시작하는 경우에는 Java 언어의 Dynamic Proxy(동적 프록시) 기능에 의해
		// 동적으로 생성된 클래스를 의미한다고 보시면 됩니다.
		// 클래스 이름의 중간에 있는 "$"는 보통 내부 클래스임을 나타냅니다.
		System.out.println(clz.getName()); // 실제 객체의 클래스 이름을 Console 창에 출력해 줍니다.

		// 클래스가 구현하고 있는 인터페이스 목록을 생성합니다.
		Class<?>[] interfaces = clz.getInterfaces();
		// 클래스가 구현하고 있는 인터페이스 목록을 Console 창에 출력해 줍니다.
		Stream.of(interfaces).forEach(inter -> System.out.println(inter.getName()));  

		// 클래스의 Super(부모) 클래스를 생성합니다.
		Class<?> superClasses = clz.getSuperclass();
		// 클래스의 Super(부모) 클래스의 이름을 Console 창에 출력해 줍니다.
		System.out.println(superClasses.getName());
	}
	
	// 게시물 추가 테스트	
	@Test
	public void testInsert() throws Exception {

		Pdboard pdboard = new Pdboard();
		pdboard.setAdmin("관리자");
		pdboard.setTitle("제목테스트");
		pdboard.setContent("내용 테스트");
		pdboard.setPrice((long) 2500);
		pdboard.setPdcode((long) 77);

		pdboardRepo.save(pdboard);
	}
	
}

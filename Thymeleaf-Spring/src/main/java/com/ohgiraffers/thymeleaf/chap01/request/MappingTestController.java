package com.ohgiraffers.thymeleaf.chap01.request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //
@RequestMapping("/order/*") // 클래스 레벨 설정
public class MappingTestController {

    // 1. Class 레벨 매핑
    @GetMapping("/regist")
    public String registOrder(Model model){
        model.addAttribute("message","GET 방식의 주문 등록용 핸들러 메소드 호출함");
        return "request/mappingResult";
    }

    /* 2. 여러 개의 패턴 매핑
    *  value 속성에 중괄호를 이용해 매핑할 url을 나열한다 */
    @RequestMapping(value = {"modify","delete"}, method = RequestMethod.POST)
    public String modifyAndDelete(Model model){
        model.addAttribute("message","POST 방식의 주문정보");
        return "request/mappingResult";
    }

    // PathVariable 어노테이션 이용, {orderNo} : 바뀔수 있는 값
    @GetMapping("/detail/{orderNo}")
    public String selectOrderDetail(Model model, @PathVariable("orderNo") int orderNo){
        model.addAttribute("message", orderNo+"번 주문 내용");
        return "request/mappingResult";
    }
}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>      
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

<div class="form-group">
          <label>NO.</label> <input class="form-control" name='qno'
             value='<c:out value="${get.qno}" />' readonly="readonly">
        </div>

          <div class="form-group">
            <label>Title</label> 
            <input class="form-control" name='q_title'
            value='<c:out value="${get.q_title}" />' readonly="readonly">
          </div>

          <div class="form-group">
          <label>Text area</label>
          <textarea class="form-control" rows="3" name='q_content'
            readonly="readonly"><c:out value="${get.q_content}" /></textarea>
        </div>

          <div class="form-group">
            <label>Writer</label>
       		<input class="form-control" name='q_writer'
       		 value='<c:out value="${get.q_writer}" />' readonly="readonly"
       		>
       
          </div>
     
 
	<button data-oper='list' class="" onclick="location.href='/qna/list'">리스트</button>
	
<!--  댓글부분 -->
			<div class="reply_subject">
					<h2>댓글</h2>
			</div>


  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>



</body>
</html>
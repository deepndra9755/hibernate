<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<c:choose>

  <c:when test="${vo ne null}">
         <table border="0" width="150" height="50" bgcolor="#ff0000">
           <tr align="center">
           
          <td>${ vo.name}</td>
           <td>${ vo.last}</td>
            <td>${ vo.sallary}</td>
             <td>${ vo.pf}</td>
           
           </tr>
           
         </table>
      </c:when>

</c:choose>
                      
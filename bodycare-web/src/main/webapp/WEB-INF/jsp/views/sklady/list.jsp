<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<my:layout title="Seznam skladů">
    <jsp:attribute name="body">
	<table class="table table-bordered">
	    <tr>
		<th>Id</th>
		<th>Název</th>
	    </tr>
	    <c:forEach items="${sklads}" var="sklad">
		<tr>
		    <td><c:out value="${sklad.id}"/></td>
		    <td><c:out value="${sklad.nazev}"/></td>
		    <td class="text-center">
			<a href="${pageContext.request.contextPath}/sklady/detail/${sklad.id}">
			    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			</a>
		    </td>
		</tr>
	    </c:forEach>
	</table>

    </jsp:attribute>
</my:layout>
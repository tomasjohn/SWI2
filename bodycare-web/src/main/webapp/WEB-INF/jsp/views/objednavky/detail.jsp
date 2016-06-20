<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<my:layout title="Objednávka ${objednavka.id}">
    <jsp:attribute name="body">
	<table class="table table-bordered">
	    <tr>
		<th>Zákazník</th>
		<th>Adresa</th>
		<th>Sleva</th>
	    </tr>
	    <tr>
		<td>${objednavka.zakaznik.jmeno}</td>
		<td>${objednavka.zakaznik.adresa}</td>
		<td>${objednavka.zakaznik.sleva}</td>
	    </tr>
	</table>
	<table class="table table-bordered">
	    <tr>
		<th>Id</th>
		<th>Název</th>
		<th>Značka</th>
		<th>Daň</th>
		<th>Cena</th>
	    </tr>
	    <c:forEach items="${objednavka.zbozi}" var="z">
		<tr>
		    <td><c:out value="${z.id}"/></td>
		    <td><c:out value="${z.nazev}"/></td>
		    <td><c:out value="${z.znacka}"/></td>
		    <td><c:out value="${z.dan}"/></td>
		    <td><c:out value="${z.cena}"/></td>
		</tr>
	    </c:forEach>
	</table>

    </jsp:attribute>
</my:layout>
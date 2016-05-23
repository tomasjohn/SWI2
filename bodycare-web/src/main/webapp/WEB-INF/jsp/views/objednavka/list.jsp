<%--<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<my:layout title="Objednávky">
    <jsp:attribute name="body">
        <div class="row">
	    <div class="col-xs-12">
		<table class="table table-bordered table-striped">
		    <thead>
			<tr>
			    <th>Id</th>
			    <th>Zákazník</th>
			</tr>
		    </thead>
		    <tbody>
			<c:forEach var="objednavka" items="${objednavkas}">
			    <tr>
				<td><c:out value="${objednavka.id}"/></td>
				<td><c:out value="${objednavka.zakaznik.jmeno}"/></td>
			    </tr>
			</c:forEach>
		    </tbody>
		</table>
	    </div>
	</div>
    </jsp:attribute>
</my:layout>--%>

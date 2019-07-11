<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:login title="Erro!!">
    <jsp:body>
        <h2>Ooops!! Estamos com problemas!</h2>
        <p>Pedimos desculpas! Houve um erro ao persistir os seus dados!</p>

        <div class="row">
            <div class="col s12 center">
                <img class="img-responsive" src="assets/res/img/error.png" height="500px">
            </div>
        </div>
    </jsp:body>
</t:login>

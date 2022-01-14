<%--
  Created by IntelliJ IDEA.
  User: CoCo灰灰
  Date: 2021/11/21
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js"></script>
    <script>
        function a1() {
            $.post({
                url:"${pageContext.request.contextPath}/check",
                data:{name:$("#name").val()},
                success:function (data) {
                    if (data.toString()==='ok'){
                        $("#userInfo").css("color","green");
                    }else{
                        $("#userInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                }
            })
        }
        function a2() {
            $.post({
                url:"${pageContext.request.contextPath}/check",
                data:{name:$("#name").val()},
                success:function (data) {
                    console.log(data);
                }
            })
        }
    </script>
</head>
<body>
<p>
    用户名：<input type="text" id="name" onblur="a1()">
    <span id="userInfo"></span><br>
    用户名：<input type="password" id="password" onblur="a2()">
    <span id="pwdInfo"></span>
</p>
</body>
</html>

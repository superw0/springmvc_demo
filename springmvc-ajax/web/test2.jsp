<%--
  Created by IntelliJ IDEA.
  User: CoCo灰灰
  Date: 2021/11/21
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>

    <script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.post("${pageContext.request.contextPath}/a2",function (data) {
                    //console.log(data);
                    var html = "";
                    for (let i = 0; i <data.length ; i++) {
                        html+="<tr>"+
                            "<td>"+data[i].name+"</td>"+
                            "<td>"+data[i].age+"</td>"+
                            "<td>"+data[i].sex+"</td>"+
                            "</tr>";
                    }
                    $("#content").html(html);

                })
            })
        });
    </script>

</head>

<body>
<input type="button" value="加载数据" id="btn"/>
<table>
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
    </tr>
    <tbody id="content">

    </tbody>
</table>

</body>
</html>

<form>
    编号：<input type="text" name="id" value="1"/><br/>
    姓名：<input type="text" name="name" value="哈哈"/><br/>
    薪水：<input type="text" name="sal" value="5000"/><br/>
    <input type="button" value="异步提交注册"/>
</form>
<script type="text/javascript">
    $(":button").click(function(){
        var url = "${pageContext.request.contextPath}/ testJson ";
        var sendData = {
            "id":1,
            "name":"哈哈",
            "sal":5000
        };
        $.post(url,sendData,function(backData,textStatus,ajax){
            alert(ajax.responseText);
        });
    });
</script>
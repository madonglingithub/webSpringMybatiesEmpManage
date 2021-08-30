<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加页面</title>
<!--easyui支持引入  -->
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"/>
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"/>
<script type="text/javascript" src="easyui/jquery-1.9.1.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
<p align="center">员工列表</p>
<hr />
<form action="" name="ffemp" id="ffemp">
	<table border="1px" width="600px" align="center">
		<tr bgcolor="#FFFFCC" align="center">
			<td colspan="3">员工管理</td>
		</tr>
		<tr>
			<td>姓名</td>
			<td><input type="text" id="ename" name="ename" class="easyui-validatebox" data-options="required:true"></td>
			<td rowspan="7">
				<a href="uppic/default.jpg" >
					<img alt="图片不存在" src="uppic/default.jpg" width="200px" height="200px">
				</a>			
			</td>
		</tr>
		<tr>
			<td>性别</td>	
			<td>
			<input type="radio" id="sex" name="sex" value="男" checked="checked">男
			<input type="radio" id="sex" name="sex" value="女">女
			</td>		
		</tr>
		<tr>
			<td>地址</td>
			<td><input type="text" id="address" name="address"></td>		
		</tr>
		<tr>
			<td>生日</td>
			<td><input type="date" id="sdate" name="sdate"></td>			
		</tr>
		<tr>
			<td>照片</td>
			<td><input type="file" id="pic" name="pic"></td>			
		</tr>
		<tr>
			<td>部门</td>
			<td><input type="text" id="depid" name="depid"></td>			
		</tr>
		<tr>
			<td>薪资</td>
			<td><input type="text" id="emoney" name="emoney" value="2000"></td>			
		</tr>
		<tr>
			<td>福利</td>
			<td colspan="2"><span id="wf">福利</span></td>
		</tr>
		<tr bgcolor="#FFFFCC" align="center">
			<td colspan="3">
				<input type="button" id="btsave" name="btsave" value="保存">
				<input type="button" id="btupdate" name="btupdate" value="修改">
				<input type="reset" id="btreset" name="btreset" value="取消">
			</td>
		</tr>	
	</table>
</form>
</body>
</html>
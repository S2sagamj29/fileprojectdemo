<?php include ('head.php');?>

<body>
<?php include ('index_banner.php');?>
    <div class="container">
        <div class="row">
		
                    <center> 
                        <i>Đăng nhập bởi:</i>
                        <select onchange = "page(this.value)">
                            <option  value = "../admin2/index.php">Quản trị viên</option>
                            <option value = "../login.php">Người dùng hệ thống</option> 
                    </select>
                        
                    </center>
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">

                    
                    <div class="form-heading">
                        <center>Quản trị viên đăng nhập</center>
                    </div>
                    <div class="panel-body">
                        <form role="form" method = "post" enctype = "multipart/form-data">
                                <div class="form-group">
                                    <label for = "username" >ID Quản trị viên</label>
                                        <input class="form-control" placeholder="Enter Login ID" name="login_id" type="text" autofocus>
                                </div>
							
                                <div class="form-group">
									<label for = "username" >Tài khoản</label>
										<input class="form-control" placeholder="Enter Username" name="username" type="text" autofocus>
                                </div>
								
                                <div class="form-group">
									<label for = "username" >Mật khẩu</label>
										<input class="form-control" placeholder="Enter Password" name="password" type="password" value="">
                                </div>
                             
                              
                                <button class="btn btn-lg btn-success btn-block " name = "login">Đăng nhập</a>
							
									<?php include ('login_query.php');?>
                        </form>
                    </div>
                </div>
            </div>
			
			 </div>
        </div>
    </div>
    <script type="text/javascript">
  function page (src) {
    window.location = src;
  }
  </script>

  <?php 
  include ('script.php');
  include ('footer.php');
  ?>

</body>

</html>

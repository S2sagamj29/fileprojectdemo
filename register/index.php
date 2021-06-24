
<?php include ('head.php');?>
<body>

    <div id="wrapper">
    	<?php    
        include ('index_banner.php');
        ?>
        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="row">
			
					<div class="form-panel">
                      
                        <div class="form-body"> 

                         <form method = "post" enctype = "multipart/form-data">
                         	
                                <div class="form-heading">
                         		<center>ĐĂNG KÍ BÌNH CHỌN</center>
                         		</div>
											<div class="form-field">
												<label>Tên tài khoản</label><br/>
												<input class ="form-control" type = "text" name = "id_number" placeholder = "Tên tài khoản" required="true">
													
											</div>
											
											<div class="form-field">											
												<label>Mật khẩu</label><br/>
													<input class="form-control"  type = "password" name = "password" id = "pass" placeholder="Mật khẩu" required="true"/>
											</div>
											<div class="form-field">											
												<label>Nhập lại mật khẩu</label><br/>
													<input class="form-control"  type = "password" name = "password1" id = "pass" placeholder="Nhập lại mật khẩu" required="true"/>
											</div>

											<div class="form-field">
												<label>TÊN</label><br/>
													<input class="form-control" type ="text" name = "firstname" placeholder="Tên" required="true">
											</div>
											
											<div class="form-field">
												<label>HỌ</label><br/>
													<input class="form-control"  type = "text" name = "lastname" placeholder="Họ" required="true">
											</div>

											<div class="form-field">
												<label>GIỚI TÍNH</label> <br/>
													<select class = "form-control" name = "gender">
														<option >Nam</option>
														<option >Nữ</option>														
													</select>
											</div>
											
								

										
											</div>
												<br/>					
											 	 <center><button name = "save" type="submit">TẠO TÀI KHOẢN</button></center>
                                            <div class="link">
											 	 <h2><center><a href="../login.php" style = "font-size:16px;">ĐĂNG NHẬP</a></center></h2>
											</div>

						  				 </div>
                                       
										
										</form>
								
							<?php //PHP script to insert signup data into database
								require 'signUpData.php';
								
							?>

						</div>
						    
					</form>
					
                    </div>
                </div>
            
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->
        <?php 
        include ('footer.php');
        ?>

    </div>
    <!-- /#wrapper -->
</body>

</html>


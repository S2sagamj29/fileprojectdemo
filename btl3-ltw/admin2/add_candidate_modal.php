<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
        <div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="myModalLabel">         
					<div class="panel panel-primary">
						<div class="panel-heading">
							<center>Thêm ứng cử viên</center>
						</div>    
					</div>
				</h4>
			</div>
										
										
            <div class="modal-body">
				<form method = "post" enctype = "multipart/form-data">	

										
					<div class="form-group">
						<label>TÊN ỨNG VIÊN</label>
							<input class="form-control" type ="text" name = "firstname" placeholder="Tên ứng viên" required="true">
					</div>
					<div class="form-group">
						<label>HỌ ỨNG VIÊN</label>
							<input class="form-control"  type = "text" name = "lastname" placeholder="Họ ứng viên" required="true">
					</div>
											
		
															
					<div class="form-group">
						<label>GIỚI TÍNH</label>
							<select class = "form-control" name = "gender">
								<option>Male</option>
								<option>Female</option>
							</select>
					</div>
											
											
					<div class="form-group">
                        <label>HÌNH ẢNH</label>
						<input type="file" name="image"required> 
                    </div>
						<button name = "save" type="submit" class="btn btn-primary">Lưu</button>
				</form>  
			</div>
            <div class="modal-footer">
              <button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
            </div>
										
										
										
										
			<?php 
				require_once 'dbcon.php';
				
				if (isset ($_POST ['save'])){
	
					$firstname=$_POST['firstname'];
					$lastname=$_POST['lastname'];
					
					$gender=$_POST['gender'];
					$image= addslashes(file_get_contents($_FILES['image']['tmp_name']));
					$image_name= addslashes($_FILES['image']['name']);
					$image_size= getimagesize($_FILES['image']['tmp_name']);
		
					move_uploaded_file($_FILES["image"]["tmp_name"],"upload/" . $_FILES["image"]["name"]);			
					$location="upload/" . $_FILES["image"]["name"];
					
					
					$conn->query("INSERT INTO candidate(firstname,lastname,gender,img)values('$firstname','$lastname','$gender','$location')")or die($conn->error);
				}						
			?>					
        </div>
                                   
<!-- /.modal-content -->
                                
	</div>
                               
<!-- /.modal-dialog -->
								
</div>
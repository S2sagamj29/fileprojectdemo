<?php include ('session.php');?>
<?php include ('head.php');?>

<body>
    <div id="wrapper">

        <!-- Navigation -->
        <?php include ('side_bar.php');?>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header">Danh sách người bình chọn hiện tại</h3>
				<a href="download.php" class="btn btn-success btn-outline"><i class="glyphicon glyphicon-save"></i> Import Students Data</a>
                <a href="add_student_id.php" class="btn btn-success btn-outline"><i class="glyphicon glyphicon-save"></i> Add Student ID</a>	
               
				<hr/>
                
                
                
				
                    <div class="panel panel-default">
                        
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                         
                                            <th>Tên tài khoản</th>
                                            <th>Tên</th>
                                            <th>Ngày đăng kí</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
										<?php 
											require 'dbcon.php';
											
											$query = $conn->query("SELECT * FROM ids ORDER BY id_number DESC");
											while($row1 = $query->fetch_array()){
											$voters_id=$row1['id_number'];
										?>
                                      
											<tr>
												<td><?php echo $row1 ['id_number'];?></td>
												<td><?php echo $row1 ['names'];?></td>
												<td><?php echo $row1 ['started'];?></td>		
											</tr>
										
                                       <?php } ?>
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
              
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->



    </div>
    <!-- /#wrapper -->

    <?php include ('script.php');?>

</body>

</html>

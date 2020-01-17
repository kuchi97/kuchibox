<!-- The overlay -->

<div class='row'>
	<div id="myNav" class='col-md-2 bg-info'>
		<div class="overlay">
		
		  <!-- Button to close the overlay navigation -->
		  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		
		  <!-- Overlay content -->
		  <div class="overlay-content">
		    <a href="#">About</a>
		    <a href="#">Services</a>
		    <a href="#">Clients</a>
		    <a href="#">Contact</a>
		  </div>
		
		</div>
	</div>
	
	<div class='col-md-10 bg-danger'>
		<!-- Use any element to open/show the overlay navigation menu -->
		<span onclick="openNav()">open</span>
	</div>
	
</div>


<script>

/* Open when someone clicks on the span element */
function openNav() {
  document.getElementById("myNav").style.width = "100%";
}

/* Close when someone clicks on the "x" symbol inside the overlay */
function closeNav() {
  document.getElementById("myNav").style.width = "0%";
}


</script>

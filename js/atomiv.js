(function($) {
    "use strict"; // Start of use strict

    $(document).ready(function () {
  
      // close nav when click on link
      $('.navbar-collapse a').click(function(){
        $('.navbar-collapse').collapse('hide');
      });

      // close nav when click outside
      $(function() {
        $(document).click(function (event) {
        $('.navbar-collapse').collapse('hide');
        });
      });

      // change active class in navbar
      $('.ov-navbar-nav .nav-link').click(function(){
        $('.ov-navbar-nav .nav-link').removeClass('active');
        $(this).addClass('active');
      })

      // Instantiate clipboard by passing a string selector
      var clipboard = new ClipboardJS('.btn');
      clipboard.on('success', function(e) {
          console.log(e);

          e.clearSelection();
      });
      clipboard.on('error', function(e) {
          console.log(e);
      });

    });

})(jQuery); // End of use strict
  

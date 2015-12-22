(function($){
$(document).ready(function() {

        function remove_active_attribute(){
            $('.accordion .accordion-section-title').removeClass('active');
        }
        function close_accordion_section() {
            $('.accordion .accordion-section-content').slideUp(300) .removeClass('open');
        }
        function remove_attribute_active_bis(){
            $('.accordion .accordion-section-title-bis').removeClass('active');
        }
        function close_accordion_section_bis() {
            $('.accordion .accordion-section-content-bis').slideUp(300).removeClass('open');
        }

        $('.accordion-section-title').click(function(e) {
            // Grab current anchor value
            var currentAttrValue = $(this).attr('href');

            if($(e.target).is('.active')) {
                remove_active_attribute();
                close_accordion_section();
                close_accordion_section_bis();
            }else {
                close_accordion_section();
                remove_active_attribute();

                // Add active class to section title
                $(this).addClass('active');
                // Open up the hidden content panel
                $('.accordion ' + currentAttrValue).slideDown(300).addClass('open');
            }

            e.preventDefault();
        });
        $('.accordion-section-title-bis').click(function(e) {
            // Grab current anchor value
            var currentAttrValue = $(this).attr('href');

            if($(e.target).is('.active')) {
                remove_attribute_active_bis();
                close_accordion_section_bis();
            }else {
                close_accordion_section_bis();
                //close_accordion_section();

                // Add active class to section title
                $(this).addClass('active');
                // Open up the hidden content panel
                $('.accordion ' + currentAttrValue).slideDown(300).addClass('open');
            }

            e.preventDefault();
        });

        $('#importp').click(function() {
            $(this.form.elements).filter('.btnp').prop('checked', this.checked);
        });
        $('#importall').click(function() {
            $(this.form.elements).filter('.btnp, .btn-import').prop('checked', this.checked);
        });

    /*function lance_popup(){
        console.log("test test");
        if(window.location.href == "http://localhost:8080/portal/intranet/yoda?action=popup&oauth_token=75--66af7fd3-aa35-48a5-b81d-7db1d660d78a&oauth_verifier=68594"){
            console.log("test test 2");
            window.location.href='http://localhost:8080/portal/intranet/yoda#popup';
        }
    }*/
});
})(jQuery);
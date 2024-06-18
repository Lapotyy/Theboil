document.addEventListener('DOMContentLoaded', function() {
    const dropBtn = document.querySelector('.dropbtn');
    const dropdownContent = document.querySelector('.dropdown-content');

    // Toggle dropdown visibility on button click
    dropBtn.addEventListener('click', function(event) {
        event.preventDefault(); // Prevent default behavior
        dropdownContent.classList.toggle('show'); // Toggle the 'show' class on dropdownContent
    });

    // Close dropdown when clicking outside of it
    document.addEventListener('click', function(event) {
        if (!event.target.closest('.dropdown')) {
            dropdownContent.classList.remove('show');
        }
    });

    // Close dropdown when a dropdown item is clicked
    dropdownContent.addEventListener('click', function(event) {
        if (event.target.tagName === 'A') {
            dropdownContent.classList.remove('show');
        }
    });
});

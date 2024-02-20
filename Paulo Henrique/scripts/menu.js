document.addEventListener('DOMContentLoaded', function () {
  const mobileMenuButton = document.getElementById('burguer');
  const navList = document.getElementById('nav-list');

  mobileMenuButton.addEventListener('click', function () {
    navList.classList.toggle('show');
  });
});
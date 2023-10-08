const form = document.getElementById("survey-form");
const popup = document.getElementById("popup");
const closePopup = document.getElementById("close-popup");
const popupResults = document.getElementById("popup-results");
const resetbutton = document.getElementById("reset-btn");

form.addEventListener("submit", function (e) {
  e.preventDefault();

  const formData = new FormData(form);
  let resultsHtml = "<h3>Survey Results:</h3>";
  formData.forEach((value, key) => {
    resultsHtml += `<p><strong>${key}:</strong> ${value}</p>`;
  });
  popupResults.innerHTML = resultsHtml;

  popup.style.display = "block";

  form.reset();
});

resetbutton.addEventListener("click", () => {
  form.reset();
});

closePopup.addEventListener("click", function () {
  popup.style.display = "none";
  form.reset();
});

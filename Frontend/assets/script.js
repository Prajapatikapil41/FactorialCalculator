async function calculateFactorial() {
  const numberInput = document.getElementById("number");
  const resultDiv = document.getElementById("result");
  const number = parseInt(numberInput.value);

  resultDiv.textContent = "";

  if (isNaN(number) || number < 0) {
    resultDiv.textContent = "❌ Please enter a non-negative integer.";
    resultDiv.style.color = "red";
    return;
  }

  try {
    const response = await fetch(`http://localhost:8080/api/factorial/${number}`);
    const result = await response.text();

    if (response.ok) {
      resultDiv.style.color = "green";
      resultDiv.textContent = `✔️ Factorial of ${number} is ${result}`;
    } else {
      resultDiv.style.color = "red";
      resultDiv.textContent = result;
    }
  } catch (error) {
    resultDiv.style.color = "red";
    resultDiv.textContent = "⚠️ Error connecting to backend.";
  }
}

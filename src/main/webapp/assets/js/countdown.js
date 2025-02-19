let seconds = 5;  // Initial countdown value
function updateCountdown() {
    if (seconds >= 0) {
        document.getElementById("countdown").innerText = seconds;
        seconds--;
        setTimeout(updateCountdown, 1000);  // Call function every second
    }
}
window.onload = updateCountdown;  // Start countdown when page loads

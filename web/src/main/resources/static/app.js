const gatewayBase = "http://localhost:8080"; // replace with your gateway URL

async function fetchCatalog() {
  const res = await fetch(`${gatewayBase}/catalog`);
  const data = await res.json();
  document.getElementById("catalogData").textContent = JSON.stringify(data, null, 2);
}

async function fetchInventory() {
  const res = await fetch(`${gatewayBase}/inventory`);
  const data = await res.json();
  document.getElementById("inventoryData").textContent = JSON.stringify(data, null, 2);
}

async function fetchOrders() {
  const res = await fetch(`${gatewayBase}/order`);
  const data = await res.json();
  document.getElementById("orderData").textContent = JSON.stringify(data, null, 2);
}

<template>
  <div>
    <table>
      <thead>
        <tr>
          <th>Product ID</th>
          <th>Name</th>
          <th>Weight</th>
          <th>Calories</th>
          <th>Protein</th>
          <th>carb</th>
          <th>fat</th>
          <th>fiber</th>
          <!-- Add more columns as needed -->
        </tr>
      </thead>
      <tbody>
        <tr v-for="product in products" :key="product.productId">
          <td>{{ product.productId }}</td>
          <td>{{ product.name }}</td>
          <td>{{ product.weight }}</td>
          <td>{{ product.calory }}</td>
          <td>{{ product.protein }}</td>
          <td>{{ product.carb }}</td>
          <td>{{ product.fat }}</td>
          <td>{{ product.fiber }}</td>
        </tr>
      </tbody>
    </table>
    <div v-if="error" class="error-message">{{ error }}</div>
  </div>
</template>

<script>
import ProductService from '../services/ProductService';

export default {
  name: 'Product',
  data() {
    return {
      products: [],
      error: null
    };
  },
  methods: {
    async getProducts() {
      try {
        const response = await ProductService.getProducts();
        this.products = response;
      } catch (error) {
        this.error = 'Failed to fetch products: ' + error.message;
      }
    }
  },
  created() {
    console.log('Component created');
    this.getProducts();
  }
};

</script>

<style scoped>
.error-message {
  color: red;
  margin-top: 10px;
}
</style>
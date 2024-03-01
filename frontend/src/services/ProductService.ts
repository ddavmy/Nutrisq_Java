import axios from 'axios';

const PRODUCT_API_BASE_URL = 'http://localhost:8080/api/products';

class ProductService {
  async getProducts() {
    try {
      const response = await axios.get(PRODUCT_API_BASE_URL);
      return response.data;
    } catch (error) {
      throw new Error('Failed to fetch products');
    }
  }
}
export default new ProductService();
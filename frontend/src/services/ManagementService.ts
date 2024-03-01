import axios from 'axios';

const USER_API_BASE_URL = 'http://localhost:8080/api/users';

class ManagementService {
  async getUsers() {
    try {
      const response = await axios.get(USER_API_BASE_URL);
      return response.data;
    } catch (error) {
      throw new Error('Failed to fetch users');
    }
  }
}
export default new ManagementService();
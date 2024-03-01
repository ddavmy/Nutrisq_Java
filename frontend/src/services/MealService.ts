// MealService.js
import axios from 'axios';

const MEAL_API_BASE_URL = 'http://localhost:8080/api/meals/1';

class MealService {
    async getMeals() {
        try {
            const response = await axios.get(MEAL_API_BASE_URL);
            return response.data;
        } catch (error: any) { // Specify 'any' type for error
            if (error.response) {
                throw new Error('Failed to fetch meals: ' + error.response.data.message);
            } else if (error.request) {
                throw new Error('No response from server');
            } else {
                throw new Error('Error making request: ' + error.message);
            }
        }
    }
}

export default new MealService();

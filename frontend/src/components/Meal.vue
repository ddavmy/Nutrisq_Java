<template>
  <div>
      <table>
          <thead>
              <tr>
                  <th>Meal ID</th>
                  <th>Name</th>
                  <th>Weight</th>
                  <th>Email</th>
                  <th>Date</th>
              </tr>
          </thead>
          <tbody>
              <tr v-for="meal in meals" :key="meal.mealId">
                  <td>{{ meal.mealId }}</td>
                  <td>{{ meal.productName }}</td>
                  <td>{{ meal.weight }}</td>
                  <td>{{ meal.userName }}</td>
                  <td>{{ meal.date }}</td>
              </tr>
          </tbody>
      </table>
      <div v-if="error" class="error-message">{{ error }}</div>
  </div>
</template>

<script>
import MealService from '../services/MealService';

export default {
  name: 'Meals',
  data() {
      return {
          meals: [],
          error: null
      };
  },
  methods: {
      async getMeals() {
          try {
              this.meals = await MealService.getMeals();
          } catch (error) {
              this.error = 'Failed to fetch meals: ' + error.message;
          }
      }
  },
  created() {
      console.log('Component created - Meals');
      this.getMeals();
  }
};
</script>

<style scoped>
.error-message {
  color: red;
  margin-top: 10px;
}
</style>

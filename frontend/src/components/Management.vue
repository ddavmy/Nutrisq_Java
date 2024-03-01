<template>
  <div>
    <table>
      <thead>
        <tr>
          <th>User ID</th>
          <th>Email</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Role</th>
          <th>Options</th>
          <!-- Add more columns as needed -->
        </tr>
      </thead>
      <tbody>
        <tr v-for="user in users" :key="user.userId">
          <td>{{ user.userId }}</td>
          <td>{{ user.email }}</td>
          <td>{{ user.name }}</td>
          <td>{{ user.lastName }}</td>
          <td>{{ user.roleName }}</td>
          <td>
            <button type="button" class="btn btn-outline-primary">Edit</button>
            <button type="button" class="btn btn-outline-primary">Delete</button>
          </td>
        </tr>
      </tbody>
    </table>
    <div v-if="error" class="error-message">{{ error }}</div>
  </div>
</template>

<script>
import ManagementService from '../services/ManagementService';

export default {
  name: 'Management',
  data() {
    return {
      users: [],
      error: null
    };
  },
  methods: {
    async getUsers() {
      try {
        const response = await ManagementService.getUsers();
        this.users = response;
      } catch (error) {
        this.error = 'Failed to fetch users: ' + error.message;
      }
    }
  },
  created() {
    console.log('Component created');
    this.getUsers();
  }
};

</script>

<style scoped>

</style>
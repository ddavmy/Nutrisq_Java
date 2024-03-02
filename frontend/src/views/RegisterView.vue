<template>
  <Header />

  <!-- Main -->
  <div id="main">

    <!-- Portfolio -->
    <section id="portfolio" class="two">
      <div class="container">
        <form @submit.prevent="saveData">
          <div class="form-row">
            <div class="form-group col-md-6">
              <label for="inputEmail">Email</label>
              <input v-model="user.email" type="email" class="form-control" id="inputEmail">
            </div>
            <div class="form-group col-md-6">
              <label for="inputPassword">Password</label>
              <input v-model="user.password" type="password" class="form-control" id="inputPassword">
            </div>
          </div>
          <div class="form-group">
            <label for="firstName">First Name</label>
            <input v-model="user.name" type="text" class="form-control" id="firstName">
          </div>
          <div class="form-group">
            <label for="lastName">Last Name</label>
            <input v-model="user.lastName" type="text" class="form-control" id="lastName">
          </div>
          <button type="submit" class="btn btn-primary">Sign Up</button>
        </form>
      </div>
    </section>

  </div>

  <Footer />

</template>

<script>
import Header from './pages/Header.vue';
import Footer from './pages/Footer.vue';
import axios from 'axios';

export default {
  components: {
    Header,
    Footer
  },
  data() {
    return {
      user: {
        email: '',
        password: '',
        name: '',
        lastName: '',
        roleId: 1 // Set a default value for roleId
      }
    };
  },
  methods: {
    saveData() {
      axios.post("http://localhost:8080/api/user", this.user)
      .then(response => {
        console.log("User registered successfully:", response.data);
        alert("User registered successfully");
        // Optionally, you can navigate to another page or show a success message
      })
      .catch(error => {
        console.error('Error registering user:', error.response.data);
        alert("Error registering user");
        // Optionally, you can display an error message to the user
      });
    }
  }
};
</script>

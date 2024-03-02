<template>
  
<Header />

<!-- Main -->
<div id="main">

<!-- Portfolio -->
    <section id="portfolio" class="two">
        <div class="container">
          <form>
            <div class="form-row">
              <div class="form-group col-md-6">
                <label for="inputEmail">Email</label>
                <input type="email" class="form-control" id="inputEmail">
              </div>
              <div class="form-group col-md-6">
                <label for="inputPassword">Password</label>
                <input type="password" class="form-control" id="inputPassword">
              </div>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
          </form>
        </div>
    </section>

</div>

<Footer />

</template>

<script>
import Footer from './pages/Footer.vue';
import Header from './pages/Header.vue';

export default {
  components: {
    Header,
    Footer
  },
  name: 'LoginView'
};
</script>

<style>
#meals {
  color: black;
  text-align: center;
}
</style>
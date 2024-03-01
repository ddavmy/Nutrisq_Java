<template>
  
<Header />

<!-- Main -->
<div id="main">

<!-- Portfolio -->
    <section id="portfolio" class="two">
        <div class="container">

            <header>
                <h2 id="users">Users</h2>
                <Management />
            </header>

        </div>
    </section>

</div>

<Footer />

</template>

<script>
import Header from './pages/Header.vue';
import Footer from './pages/Footer.vue';
import Management from '../components/Management.vue';

export default {
  components: {
    Header,
    Footer,
    Management
  },
  name: 'ManagementView'
};
</script>

<style>
#users {
  color: black;
  text-align: center;
}
</style>
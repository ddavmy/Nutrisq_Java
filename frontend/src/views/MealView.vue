<template>
  
<Header />

<!-- Main -->
<div id="main">

<!-- Portfolio -->
    <section id="portfolio" class="two">
        <div class="container">

            <header>
                <h2 id="meals">Meals</h2>
                <Meal />
            </header>

        </div>
    </section>

</div>

<Footer />

</template>

<script>
import Header from './pages/Header.vue';
import Footer from './pages/Footer.vue';
import Meal from '../components/Meal.vue';

export default {
  components: {
    Header,
    Footer,
    Meal
  },
  name: 'ManagementView'
};
</script>

<style>
#meals {
  color: black;
  text-align: center;
}
</style>
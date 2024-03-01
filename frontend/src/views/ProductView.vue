<template>
  
<Header />

<!-- Main -->
<div id="main">

<!-- Portfolio -->
    <section id="portfolio" class="two">
        <div class="container">

            <header>
                <h2 id="products">Products</h2>
                <Product />
            </header>

        </div>
    </section>

</div>

<Footer />

</template>

<script>
import Header from './pages/Header.vue';
import Footer from './pages/Footer.vue';
import Product from '../components/Product.vue';

export default {
  components: {
    Header,
    Footer,
    Product
  },
  name: 'ProductView'
};
</script>

<style>
#products {
  color: black;
  text-align: center;
}
</style>
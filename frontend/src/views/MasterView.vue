<template>

<Header />

<!-- Main -->
    <div id="main">

        <!-- Intro -->
            <section id="top" class="one dark cover">
                <div class="container">

                    <header>
                        <h2 class="alt">Hi! I'm <strong>nutrisq</strong>, your food manager.</h2>
                        <p>Let me help you with your feeding </p>
                    </header>

                    <footer>
                        <a href="register" class="button scrolly">Sign Up</a>
                    </footer>

                </div>
            </section>

        <!-- Portfolio -->
            <section id="portfolio" class="two">
                <div class="container">

                   <div class="row">
                        <div class="col-4 col-12-mobile">
                            <article class="item">
                                <a href="#" class="image fit"><img src="frontend/images/pic02.jpg" alt="" /></a>
                                <header>
                                    <h3>Ipsum Feugiat</h3>
                                </header>
                            </article>
                            <article class="item">
                                <a href="#" class="image fit"><img src="frontend/images/pic03.jpg" alt="" /></a>
                                <header>
                                    <h3>Rhoncus Semper</h3>
                                </header>
                            </article>
                        </div>
                        <div class="col-4 col-12-mobile">
                            <article class="item">
                                <a href="#" class="image fit"><img src="frontend/images/pic04.jpg" alt="" /></a>
                                <header>
                                    <h3>Magna Nullam</h3>
                                </header>
                            </article>
                            <article class="item">
                                <a href="#" class="image fit"><img src="frontend/images/pic05.jpg" alt="" /></a>
                                <header>
                                    <h3>Natoque Vitae</h3>
                                </header>
                            </article>
                        </div>
                        <div class="col-4 col-12-mobile">
                            <article class="item">
                                <a href="#" class="image fit"><img src="frontend/images/pic06.jpg" alt="" /></a>
                                <header>
                                    <h3>Dolor Penatibus</h3>
                                </header>
                            </article>
                            <article class="item">
                                <a href="#" class="image fit"><img src="frontend/images/pic07.jpg" alt="" /></a>
                                <header>
                                    <h3>Orci Convallis</h3>
                                </header>
                            </article>
                        </div>
                    </div>

                </div>
            </section>

        <!-- Contact -->
          <!-- <section id="contact" class="four">
                <div class="container">

                    <header>
                        <h2>Contact</h2>
                    </header>

                    <p>Elementum sem parturient nulla quam placerat viverra
                    mauris non cum elit tempus ullamcorper dolor. Libero rutrum ut lacinia
                    donec curae mus. Eleifend id porttitor ac ultricies lobortis sem nunc
                    orci ridiculus faucibus a consectetur. Porttitor curae mauris urna mi dolor.</p>

                    <form method="post" action="#">
                        <div class="row">
                            <div class="col-6 col-12-mobile"><input type="text" name="name" placeholder="Name" /></div>
                            <div class="col-6 col-12-mobile"><input type="text" name="email" placeholder="Email" /></div>
                            <div class="col-12">
                                <textarea name="message" placeholder="Message"></textarea>
                            </div>
                            <div class="col-12">
                                <input type="submit" value="Send Message" />
                            </div>
                        </div>
                    </form>

                </div>
            </section> -->

    </div>
   
    <Footer />

</template>

<script>
import Header from './pages/Header.vue';
import Footer from './pages/Footer.vue';
import Management from '../components/Management.vue';
import Meal from '../components/Meal.vue';
import Product from '../components/Product.vue';

export default {
  components: {
    Header,
    Footer,
    Management,
    Meal,
    Product
  },
  name: 'Master'
};
</script>

<style>
/* Styles for the Master.vue component */
</style>
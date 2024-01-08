const ProductController= require ("../controllers/Product.controllers");

module.exports=app =>{
    app.get("/api/products", ProductController.findAllProduct);
    app.post("/api/products",ProductController.createNewProduct);
    app.get("/api/products/:id", ProductController.findOneProduct);
    app.patch("/api/products/:id",ProductController.updateExisitingProduct);
    app.delete("/api/products/:id",ProductController.deleteOneProduct)
}
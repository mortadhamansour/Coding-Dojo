const Product = require ("../models/Product.model");


// READ ALL
module.exports.findAllProduct = (req, res) => {
    Product.find()
    .then((products) => {
        res.json(products);
    })
    .catch((err) => res.json(err));
};

// READ ONE BY ID

module.exports.findOneProduct = (req, res) => {
    Product.findOne({ _id: req.params.id })
    .then((oneProduct) => {
        res.json(oneProduct);
    })
    .catch((err) => res.json(err));
};
// CREATE

module.exports.createNewProduct = (req, res) => {
    Product.create(req.body)
    .then((newlyCreatedProduct) => {
        res.json(newlyCreatedProduct);
    })
    .catch((err) => res.json(err));
};

// UPDATE

module.exports.updateExisitingProduct = (req, res) => {
    Product.findOneAndUpdate({ _id: req.params.id }, req.body, {
    new: true,
    runValidators: true,
    })
    .then((updatedProduct) => {
        res.json(updatedProduct);
    })
    .catch((err) => res.json(err));
};

// DELETE
module.exports.deleteOneProduct = (req, res) => {
    Product.deleteOne({ _id: req.params.id })
    .then((result) => {
        res.json(result);
    })
    .catch((err) => res.json(err));
};
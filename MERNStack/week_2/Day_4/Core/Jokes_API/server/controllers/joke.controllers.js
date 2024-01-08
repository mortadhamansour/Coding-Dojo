const Joke = require("../models/joke.model");





// READ ALL
module.exports.findAllJoke = (req, res) => {
Joke.find()
    .then((jokes) => {
    res.json(jokes);
    })
    .catch((err) => res.json(err));
};

// READ ONE BY ID

module.exports.findOneJoke = (req, res) => {
    Joke.findOne({ _id: req.params.id })
    .then((oneJoke) => {
        res.json(oneJoke);
    })
    .catch((err) => res.json(err));
};

// CREATE

module.exports.createNewJoke = (req, res) => {
    Joke.create(req.body)
    .then((newlyCreatedJoke) => {
        res.json(newlyCreatedJoke);
    })
    .catch((err) => res.json(err));
};

// UPDATE

module.exports.updateExisitingJoke = (req, res) => {
    Joke.findOneAndUpdate({ _id: req.params.id }, req.body, {
    new: true,
    runValidators: true,
    })
    .then((updatedJoke) => {
        res.json(updatedJoke);
    })
    .catch((err) => res.json(err));
};

// DELETE
module.exports.deleteOneJoke = (req, res) => {
    Joke.deleteOne({ _id: req.params.id })
    .then((result) => {
        res.json(result);
    })
    .catch((err) => res.json(err));
};
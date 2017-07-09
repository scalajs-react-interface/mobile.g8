var transformer = require('metro-bundler/build/transformer');

function transform(input) {
    var options = input.options || {};
    var src = input.src;
    var filename = input.filename;
    if(filename.indexOf('scalajs-output-') > -1) {
        return {
            code: src,
            filename,
//        map: filename, //TODO check later for .map
        };
    } else {
        return transformer.transform(input)
    }

}

module.exports.transform = transform;

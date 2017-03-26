var transformer = require('react-native/packager/transformer');

function transform(src, filename, options) {
  options = options || {};
  if(filename.indexOf('scalajs-output-') > -1) {
  return {
        code: src,
        filename,
//        map: filename+".map",
      };
  } else {
   return transformer.transform(src,filename,options)
  }

}

module.exports.transform = transform;

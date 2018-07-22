function filterBlank(arr) {
    return arr.filter(isNotBlank)
}

function isNotBlank(element, index, array) {
    return !(typeof element == "undefined" || element == null || element.trim() == "");
}
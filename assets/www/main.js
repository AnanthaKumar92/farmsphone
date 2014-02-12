function onLoad() {
	 document.addEventListener("deviceready", onDeviceReady, false);
}
  
function onDeviceReady() {
     $('.locations ul li').remove();
	 $.getJSON('http://192.168.2.6:3001/locations.json', function(data) {    

             $.each(data, function(index, location) {                   
                $('.locations ul').append('<li>' +
                '<h4>' + location.name + '</h4>' +
                '<p>' + location.country + '</p>' +
                '</li>');
            });      
        $('.locations ul').listview('refresh');
    });
}	


function createLocation() {
    alert('Created SuccessFully')    
    $.mobile.changePage('#home');
    return false
}
function refreshLocation() {
    onDeviceReady();
}



function capturePhoto(){
    navigator.camera.getPicture(uploadPhoto,null,{sourceType:1,quality:60});
}
function uploadPhoto(data){
// this is where you would send the image file to server
    cameraPic.src =  data;
    // Successful upload to the server
    navigator.notification.alert(
        'Your Photo has been uploaded',  // message
        okay,                           // callback
        'Photo Uploaded',              // title
        'OK'                          // buttonName
    );
    // upload has failed Fail
    /*
    if (failedToUpload){
    navigator.notification.alert(
        'Your Photo has failed to upload',
        failedDismissed,
        'Photo Not Uploaded',
        'OK'
        );
    }
    */
}
function okay(){
    // Do something
}
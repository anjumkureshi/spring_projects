8<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">

<style type="text/css">
.topp{
color: orange;
font-size: 20px;
font-weight: bold;
}
.middlep{
color:darkblue;
font-size: 20px;
font-weight: bold;
}
.bottomp{
color: green;
font-size: 20px;
font-weight: bold;
}body{
margin: auto;
            font-family: -apple-system, BlinkMacSystemFont, sans-serif;
            overflow: auto;
            background: linear-gradient(
                315deg,
                rgba(101, 0, 94, 1) 3%,
                rgba(60, 132, 206, 1) 38%,
                rgba(48, 238, 226, 1) 68%,
                rgba(255, 25, 25, 1) 98%
            );
            animation: gradient 15s ease infinite;
            background-size: 400% 400%;
            background-attachment: fixed;
            }

            @keyframes gradient {
            0% {
                background-position: 0% 0%;
            }
            50% {
                background-position: 100% 100%;
            }
            100% {
                background-position: 0% 0%;
            }
            }

            .wave {
            background: rgb(255 255 255 / 25%);
            border-radius: 1000% 1000% 0 0;
            position: fixed;
            width: 200%;
            height: 12em;
            animation: wave 10s -3s linear infinite;
            transform: translate3d(0, 0, 0);
            opacity: 0.8;
            bottom: 0;
            left: 0;
            z-index: -1;
            }

            .wave:nth-of-type(2) {
            bottom: -1.25em;
            animation: wave 18s linear reverse infinite;
            opacity: 0.8;
            }

            .wave:nth-of-type(3) {
            bottom: -2.5em;
            animation: wave 20s -1s reverse infinite;
            opacity: 0.9;
            }

            @keyframes wave {
            2% {
                transform: translateX(1);
            }

            25% {
                transform: translateX(-25%);
            }

            50% {
                transform: translateX(-50%);
            }

            75% {
                transform: translateX(-25%);
            }

            100% {
                transform: translateX(1);
            }
            }
          .headdiv{
            background-color: rgba(252, 252, 249, 0.4);
          }
          
        #fade-in-out1 {
            opacity: 0;
            animation: fadeInOut 2s ease-in-out infinite;
        }
         #fade-in-out2 {
            opacity: 0;
            animation: fadeInOut 3s ease-in-out infinite;
        }
         #fade-in-out3 {
            opacity: 0;
            animation: fadeInOut 5s ease-in-out infinite;
        }
        

        @keyframes fadeInOut {
            0%, 100% {
                opacity: 0;
            }
            50% {
                opacity: 1;
            }
        }          

</style>
</head>
<body>
<div class="headdiv">
<p class="topp" id="fade-in-out1">Welcome to Indian Railways","  भारतीय रेलवे में आपका स्वागत है" ," ভারতীয় রেলওয়েজে আপনাকে স্বাগতম"," భారతీయ రైల్వేస్‌కు స్వాగతం"," இந்திய ரயில்வேஸில் வருக"

," ಭಾರತೀಯ ರೈಲ್ವೆಯಲ್ಲಿ ಸ್ವಾಗತ"," ഇന്ത്യൻ റെയിൽവേയിൽ സ്വാഗതം"," भारतीय रेल्वेमध्ये आपले स्वागत आहे"," ਭਾਰਤੀ ਰੈਲਵੇ ਵਿੱਚ ਤੁਹਾਨੂੰ ਜੀ ਆਇਆਂ ਨੂੰ ਕਰਦੇ ਹਾਂ","ભારતીય રેલવેની સ્વાગતમ"
</p>
<p class="middlep"id="fade-in-out2">
,"ଇଣ୍ଡିଆନ୍ ରେଲୱେସ୍‌ରେ ଆପଣଙ୍କୁ ସ୍ୱାଗତମ" ,"       ভাৰতীয় ৰেলওয়েজত স্বাগত"," भारतीय रेलमा स्वागत छ" ,"इंडियन रेल्वे वच्चें स्वागत"," انڊين ريلويءَ ۾ خش آئين","بھارتی ریلوے چھ چھ چھ سلامات"
</p>
<p class="bottomp"id="fade-in-out3">" भारतीय रेलवे में आपका स्वागत है"," ᱵᱮᱢᱰᱟᱹ ᱪᱟᱭᱟᱜ ᱯᱟᱹᱨᱥᱤ ᱯᱟᱹᱨᱥᱤ","ভারতীয় রেলওয়ে দখু গুলিয়া","भारतीय रेलवे मुँ तुसीं स्वागत आहे"," इण्डियन रेल्वे खुनार बेञ्चिनाचिना"," भारतीय रेलवे बोर देँ
</p>
</div>
<a href="searchtrains">Search your trains</a>
<div>
           <div class="wave"></div>
           <div class="wave"></div>
           <div class="wave"></div>
        </div>

</body>
</html>
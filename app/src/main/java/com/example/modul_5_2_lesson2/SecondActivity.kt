package com.example.modul_5_2_lesson2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val intF = intent.getIntExtra("Father",-1)
        val intCh = intent.getIntExtra("Child",-1)

        if(intF==0){
            if (intCh == 0){
                tv_first.text = "Mi"
                tv_second.text = "Xiaomi Corporation (/ˈʃaʊmiː/;[2] Chinese: 小米 ), registered in Asia as Xiaomi Inc., is a Chinese designer and manufacturer of consumer electronics and related software, home appliances, and household items. Behind Samsung, it is the second largest manufacturer of smartphones, all of which run the MIUI operating system, a fork of Android. In 2020, the company sold 146.3 million smartphones and, as of August 2021, its MIUI operating system had over 450 million monthly active users.[3][4] It also is a major manufacturer of appliances including televisions, flashlights, unmanned aerial vehicles, and air purifiers using its Internet of Things and Xiaomi Smart Home product ecosystems. The name \"Xiaomi\" literally means millet and rice, and is based on the Buddhist concept of starting from the bottom before aiming for the top.[5]\n" +
                        "\n" +
                        "Xiaomi was founded in 2010 in Beijing by now multi-billionaire Lei Jun when he was 40 years old, along with six senior associates. Lei had founded Kingsoft as well as Joyo.com, which he sold to Amazon for \$75 million in 2004. In August 2011, Xiaomi released its first smartphone and, by 2014, it had the largest market share of smartphones sold in China. By 2015, it was developing a wide range of consumer electronics.[6] By 2018, it had the highest market share of smartphones in India and the fourth highest market share worldwide.[7][8][9][10][11][12][13][14][15][16][17][18]\n" +
                        "\n" +
                        "In the second quarter of 2021, Xiaomi surpassed Apple Inc. to become the second-largest seller of smartphones worldwide, with a 17% market share, according to Canalys.[19]\n" +
                        "\n" +
                        "The company is ranked 338th and is the youngest company on the Fortune Global 500.[20][21]\n" +
                        "\n" +
                        "Xiaomi keeps its prices close to its manufacturing costs and bill of materials costs by keeping most of its products in the market for 18 months, longer than most smartphone companies,[22] and by making a profit from the sale of related services, software, and peripheral devices.[23][24][25][26][27][28][29] The company also uses inventory optimization and flash sales to keep its inventory low.[30][31]\n" +
                        "\n" +
                        "Initially the company only sold its products online; however, it later opened brick and mortar stores.[32]"
            }else{
                if (intCh == 1){
                    tv_first.text = "RealMe"
                    tv_second.text = "Before its startup on May 4, 2018, in India, Realme first appeared in China in 2010 with the name \"OPPO Real\".[1] It was a sub-brand of OPPO (which is itself a subsidiary of BBK Electronics)[2] until its formation as a spinoff on May 4, 2018.[3][4][5] Oppo did not specify whether it had transferred its participation in Realme to BBK. Former Oppo Vice President and Head of Oppo India and Overseas Department, Sky Li, has still remember his time during the 2017 Diwali festival in India before his foundation of this company.\n" +
                            "\n" +
                            "In May 2018, they released their first phone, Realme 1.\n" +
                            "\n" +
                            "On July 30, 2018, Sky Li announced his official resignation from Oppo and his intention to establish Realme as an independent brand on Weibo. With the company slogan \"Dare to Leap\", he declared that in the future, the Realme brand would focus on providing mobile phones with solid performance and stylish design, offering young people a joyful life with affordable \"technology\" and \"beauty\".[6]\n" +
                            "\n" +
                            "On 15 November 2018, Realme adopted a new logo.\n" +
                            "\n" +
                            "On November 22, 2018, Realme became the No. 1 emerging brand in the Indian market.[7] The sales of Realme devices in India have since surpassed the sales of its parent company Oppo. Realme has been the fourth largest smartphone brand in India since 2019, behind Xiaomi, Samsung, and Vivo. Realme holds records in India for fastest-charging smartphone[citation needed] and India's first 5G smartphone.[8]\n" +
                            "\n" +
                            "On May 15, 2019, Realme held its first conference in Beijing to officially enter the Chinese domestic market, launching the Realme X, Realme X Lite and Realme X Master Edition.[9][10]\n" +
                            "\n" +
                            "In June 2019, Realme officially announced its entry into the European market.[citation needed]\n" +
                            "\n" +
                            "On June 26, 2019, Realme released its first photo taken with its 64MP camera.[citation needed]\n" +
                            "\n" +
                            "By July 2019, Realme had successfully entered 20 markets, including China, South Asia, Southeast Asia and Europe.[11]\n" +
                            "\n" +
                            "According to a report from the international analyst institution Counterpoint, Realme recorded shipping 4.7 million units worldwide in the second quarter of 2019, which is an 848% year-on-year increase, and has become one of the top 10 mobile phone manufacturers in the world.\n" +
                            "\n" +
                            "By August 2019, Realme had surpassed 10 million users worldwide.[11]\n" +
                            "\n" +
                            "In August 2019, Realme showed a prototype device with a quadruple 64MP camera in China and India.[12][13]\n" +
                            "\n" +
                            "In 2021 they had a large user base in Europe and Asia.[14]"
                }else{
                    if (intCh == 2){
                        tv_first.text = "Samsung"
                        tv_second.text = "Samsung Galaxy (Korean: 삼성 갤럭시), (stylised as SΛMSUNG Galaxy since 2015,[2] previously stylised as Samsung GALAXY; abbreviated as SG) is a series of computing and mobile computing devices that are designed, manufactured and marketed by Samsung Electronics. The product line includes the Samsung Galaxy S series of high-end smartphones,[3] the Samsung Galaxy Tab series of tablets, the Samsung Galaxy Note series of tablets and phablets with the added functionality of a stylus, the foldable Samsung Galaxy Z series, and smartwatches including the first version of the Samsung Galaxy Gear, with later versions dropping the Galaxy branding, until the release of the Samsung Galaxy Watch in 2018.\n" +
                                "\n" +
                                "Samsung Galaxy devices use the Android operating system produced by Google, with a custom user interface called One UI (with previous versions being known as Samsung Experience and TouchWiz). However, the Galaxy TabPro S is the first Galaxy-branded Windows 10 device that was announced in CES 2016. The Galaxy Watch is the first Galaxy-branded smartwatch since the release of later iterations of the Gear smartwatch from 2014 to 2017. In April 2019, the company announced that it would postpone the release of its folding smartphone, the Samsung Galaxy Fold, days after several early reviewers said the screens on their devices had broken;[4] the Fold was rereleased in September 2019.[5]\n" +
                                "\n" +
                                "In 2020 Samsung added the Samsung Galaxy Chromebook 2-in-1 laptop running Chrome OS to the Galaxy branding lineup.[6] The follow-on Samsung Galaxy Chromebook 2 was released in 2021.[7]"
                    }else{
                        if (intCh == 3){
                            tv_first.text = "Infinix"
                            tv_second.text = "Infinix Mobile is a Hong Kong-based[1] smartphone company founded in 2013 by Sagem Wireless and Transsion Holdings.[2][3] The company has research and development centres sprawling between France and Korea and designs its phones in France. Infinix mobile phones are manufactured in France, Bangladesh, Korea, Hong Kong, China, India and Pakistan and are available in Asia and in about 30 countries in the Middle East and Africa, including Morocco, Bangladesh, Kenya, Nigeria, Egypt, Iraq,[4] Pakistan and Algeria.[5]\n" +
                                    "\n" +
                                    "Infinix Mobile became the first smartphone brand manufacturing in Pakistan. The company keeps growing its investment to contribute to boost its production.\n" +
                                    "\n" +
                                    "In 2017, Infinix Mobile gained market shares in Egypt, rising to third place after Samsung and Huawei.[6]\n" +
                                    "\n" +
                                    "On 8 May 2018, Infinix Mobile Nigeria signed an endorsement deal with David Adedeji Adeleke (Davido) as the 2018 Nigerian Mobile Brand Ambassador.[7]\n" +
                                    "\n" +
                                    "On 25 June 2020, Infinix Mobility announced the first range of smart TVs to the Nigerian electronics market.[8]\n" +
                                    "\n" +
                                    "On 18 December 2020, Infinix has officially launched its new Infinix X1 Smart Android TV in the Indian market with two models 32 inch and 43-inch screen sizes.[9]\n" +
                                    "\n" +
                                    "In May 2021, Infinix Mobile ventured into laptops, unveiling the INbook X1 series. The top-notch laptop is expected to be in Egypt, Indonesia, and Nigeria.[10][11]\n" +
                                    "\n" +
                                    "Infinix is the main sponsor of the Indian Super League Mumbai City FC.[12][13]"
                        }else{
                            if (intCh == 4){
                                tv_first.text = "Oppo"
                                tv_second.text = "Guangdong Oppo Mobile Telecommunications Corp., Ltd, doing business as OPPO,[a] is a Chinese consumer electronics and mobile communications company headquartered in Dongguan, Guangdong. Its major product lines include smartphones, smart devices, audio devices, power banks, Blu-ray players, and other electronic products. OPPO's brand believe is \"Human for mankind, kindness for the world\"[1]" +
                                        "The brand name \"Oppo\" was registered in China in 2001 and launched in 2004.[2] Since then, they have expanded to more than 40 countries.[2]\n" +
                                        "\n" +
                                        "In June 2016, OPPO became the biggest smartphone manufacturer in China,[1] selling its phones at more than 200,000 retail outlets.[3] OPPO was the top smartphone brand in China in 2019 and was ranked No. 5, in market share, worldwide.[4]" +
                                        "The South Korean boy band 2PM prepared a song known as \"Follow Your Soul\" in a promotional deal with OPPO for launching its brand in Thailand in 2010.[5] In June 2015, the company signed an agreement with FC Barcelona to become a sponsor of the Spanish football club.[6][7][8]\n" +
                                        "\n" +
                                        "In 2016, the Philippine Basketball Association tied up with this company as its official smartphone partner, beginning with the 2016 PBA Commissioner's Cup which began on 10 February.[citation needed]\n" +
                                        "\n" +
                                        "OPPO hires celebrity endorsers in Vietnam. Sơn Tùng M-TP endorsed three smartphone units: Neo 5, Neo 7, and F1s. Oppo made a sponsorship to one of Vietnam's top-rated reality shows, The Face Vietnam.[citation needed]\n" +
                                        "\n" +
                                        "In 2017, OPPO won the bid to sponsor the India national cricket team, which allows their logo to be used on the team's kits from 2017 to 2019.\n" +
                                        "\n" +
                                        "In 2019, OPPO became a sponsoring partner of the French Open tennis tournament held in Roland-Garros, Paris. The same year, they also became a sponsoring partner of Wimbledon for 5 years as the first official smartphone partner.[9][1]\n" +
                                        "\n" +
                                        "Starting with the 2019 World Championship, OPPO is the exclusive global smartphone partner for League of Legends esports through 2024, Oppo will have year-round activations centered around the sport’s three annual global tournaments: the Mid-Season Invitational, the All-Star Event, and the World Championship.[10]"
                            }else{
                                if (intCh == 5){
                                    tv_first.text = "Apple"
                                    tv_second.text = "The iPhone is a line of smartphones designed and marketed by Apple Inc. that use Apple's iOS mobile operating system. The first-generation iPhone was announced by former Apple CEO Steve Jobs on January 9, 2007. Since then, Apple has annually released new iPhone models and iOS updates. As of November 1, 2018, more than 2.2 billion iPhones had been sold.\n" +
                                            "\n" +
                                            "The iPhone has a user interface built around a multi-touch screen. It connects to cellular networks or Wi-Fi, and can make calls, browse the web, take pictures, play music and send and receive emails and text messages. Since the iPhone's launch further features have been added, including larger screen sizes, shooting video, waterproofing, the ability to install third-party mobile apps through an app store, and many accessibility features. Up to 2017, iPhones used a layout with a single button on the front panel that returns the user to the home screen. Since 2017, more expensive iPhone models have switched to a nearly bezel-less front screen design with app switching activated by gesture recognition.\n" +
                                            "\n" +
                                            "The iPhone is one of the two largest smartphone platforms in the world alongside Android, forming a large part of the luxury market. The iPhone has generated large profits for Apple, making it one of the world's most valuable publicly traded companies. The first-generation iPhone was described as \"revolutionary\" and a \"game-changer\" for the mobile phone industry and subsequent models have also garnered praise. The iPhone has been credited with popularizing the smartphone and slate form factor, and with creating a large market for smartphone apps, or \"app economy\". As of January 2017, Apple's App Store contained more than 2.2 million applications for the iPhone."
                                }else{
                                    if (intCh == 2){
                                        tv_first.text = "Honor"
                                        tv_second.text = "Honor (stylized and marketed as HONOR) is a smartphone brand majority owned by a state-owned enterprise controlled by the municipal government of Shenzhen. It was formerly owned by Huawei Technologies. As part of the former owner Huawei Consumer Business Group's dual-brand strategy, Honor provides smartphone handsets targeting young consumers but has released tablet computers and wearable technology as well.\n" +
                                                  "\n" +
                                                "As of 2016, George Zhao served as global president of Honor.[1] In November 2020, Honor was acquired by Shenzhen Zhixin New Information Technology Co., Ltd.[" +
                                                "Founded in 2013,[3][4] Honor's line of smartphones allowed Huawei to compete with mid-range online smartphone brands in China and globally.[3][5][6] Honor sells its products mainly online through its own sites as well as via third-party online retailers. Some Honor products are available to purchase at stores in select markets.[7][8]\n" +
                                                "\n" +
                                                "In November 2020, the Honor brand was sold to Shenzhen Zhixin New Information Technology, a majority state-owned company controlled by the Shenzhen municipal government, to \"ensure\" its then-parent company, Huawei's survival, due to US sanctions against them.[9][2] U.S. sanctions restricted the sale of hardware components to Huawei by American firms.[10]"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }else{
            if(intF==1){
                if (intCh == 0){
                    tv_first.text = "Dell"
                    tv_second.text = "Dell Chromebooks\n" +
                            "Simplified versatility Starting at \$348.57\n" +
                            "Family friendly and designed for any budget, our Chromebooks have all-day battery life and offer easy-to-use, cloud-based features for all levels of users—from the virtual student to the seasoned remote worker. Designed and tested to endure the day’s demands."
                }else{
                    if (intCh == 1){
                        tv_first.text = "Mac"
                        tv_second.text = "With a Mac and iPhone, you can send and receive SMS text messages — the ones in green bubbles — right from your Mac. All the messages that appear on your iPhone appear on your Mac, too, so all your conversations are up to date on all your devices. And when friends text you — regardless of what phone they have — you can respond from your Mac or your iPhone, whichever is closest.1 You can also start an SMS or iMessage conversation on your Mac by clicking a phone number in Safari, Contacts, Calendar, or Spotlight."
                    }else{
                        if (intCh == 2){
                            tv_first.text = "HP"
                            tv_second.text = "HP Laptop -15t-dw300\n" +
                                    " (277) 1B9N3AV_1 Part number: 1B9N3AV_1ENERGY STAR\n" +
                                    "Windows 11 Home 64\n" +
                                    "11th Gen Intel® Core™ i5 processor\n" +
                                    "Intel® Iris® Xe Graphics\n" +
                                    "8 GB memory; 256 GB SSD storage"
                        }else{
                            tv_first.text = "Asus"
                            tv_second.text = "Vivobook Pro 14X OLED (N7400, 11th Gen Intel)\n" +
                                    "Windows 10 Pro - ASUS recommends Windows 10 Pro for businessFree Upgrade to Windows 11¹ (when available, see below)\n" +
                                    "Up to 11th Intel® Core™ i7 processor\n" +
                                    "Up to NVIDIA® GeForce® RTX 3050\n" +
                                    "Up to 16 GB memory\n" +
                                    "Up to 1 TB SSD storage\n" +
                                    "Up to 14'' 2.8K OLED NanoEdge display\n" +
                                    "ASUS DialPad\n" +
                                    "Pantone validated"
                        }
                    }
                }
            }else{
                if(intF==2){
                    if (intCh == 0){
                        tv_first.text = "Pendrive"
                        tv_second.text = "hat is Pen Drive Commonly known as a USB flash drive it is a portable device which means it can be easily transferred from one location to another due to its compact design it looks like a pen shape and therefore it is named a pen drive.\n" +
                                "\n" +
                                "The pen drives are used in a wide range in the world they have easily replaced CDs, Floppy Disk due to their huge data storing capacity and faster data transferring speed.\n" +
                                "\n" +
                                "Pen drives and USB flash drives are connected to USB (Universal Serial Bus) Port which is available on computer motherboards they are used without any additional power supply they receive the power directly from the USB port itself and hence are playing a dominant role in the PC world."
                    }else{
                        if (intCh == 1){
                            tv_first.text = "Bag"
                            tv_second.text = "A bag (also known regionally as a sack) is a common tool in the form of a non-rigid container. The use of bags predates recorded history, with the earliest bags being no more than lengths of animal skin, cotton, or woven plant fibers, folded up at the edges and secured in that shape with strings of the same material.[1]\n" +
                                    "\n" +
                                    "Despite their simplicity, bags have been fundamental for the development of human civilization, as they allow people to easily collect loose materials such as berries or food grains, and to transport more items than could readily be carried in the hands.[1] The word probably has its origins in the Norse word baggi,[2] from the reconstructed Proto-Indo-European bʰak, but is also comparable to the Welsh baich (load, bundle), and the Greek Τσιαντουλίτσα (Chandulícha, load).\n" +
                                    "\n" +
                                    "Cheap disposable paper bags and plastic shopping bags are very common in the retail trade as a convenience for shoppers, and are often supplied by the shop for free or for a small fee. Customers may also take their own shopping bags to use in shops, these are more commonly known as tote bags or shoppers tote. Although, paper had been used for purposes of wrapping and padding in ancient China since the 2nd century BC,[3] the first use of paper bags (for preserving the flavor of tea) in China came during the later Tang Dynasty (618–907 AD).[3]"
                        }else{
                            if (intCh == 2){
                                tv_first.text = "Mouse"
                                tv_second.text = "A computer mouse (plural mice, rarely mouses)[nb 1] is a hand-held pointing device that detects two-dimensional motion relative to a surface. This motion is typically translated into the motion of a pointer on a display, which allows a smooth control of the graphical user interface of a computer.\n" +
                                        "\n" +
                                        "The first public demonstration of a mouse controlling a computer system was in 1968. Mice originally used two separate wheels to track movement across a surface; one in the X-dimension, and one in the Y. Later, the standard design shifted to utilise a ball rolling on a surface to detect motion. Most modern mice use optical sensors that have no moving parts. Though originally all mice were connected to a computer by a cable, some modern mice are cordless, relying on short-range radio communication with the connected system.\n" +
                                        "\n" +
                                        "In addition to moving a cursor, computer mice have one or more buttons to allow operations such as selection of a menu item on a display. Mice often also feature other elements, such as touch surfaces and scroll wheels, which enable additional control and dimensional input."
                            }else{
                                tv_first.text = "Keyboard"
                                tv_second.text = "A computer keyboard is a peripheral input device modeled after the typewriter keyboard[1] which uses an arrangement of buttons or keys to act as mechanical levers or electronic switches. Replacing early punched cards and paper tape technology, interaction via teleprinter-style keyboards have been the main input method for computers since the 1970s, supplemented by the computer mouse since the 1980s.\n" +
                                        "\n" +
                                        "Keyboard keys (buttons) typically have a set of characters engraved or printed on them, and each press of a key typically corresponds to a single written symbol. However, producing some symbols may require pressing and holding several keys simultaneously or in sequence.[2] While most keyboard keys produce letters, numbers or symbols (characters), other keys or simultaneous key presses can prompt the computer to execute system commands, such as such as the Control-Alt-Delete combination used with Microsoft Windows.[3][4] In a modern computer, the interpretation of key presses is generally left to the software: the information sent to the computer, the scan code, tells it only which key (or keys) on which row and column, was pressed or released.[5]\n" +
                                        "\n" +
                                        "In normal usage, the keyboard is used as a text entry interface for typing text, numbers, and symbols into application software such as a word processor, web browser or social media app."
                            }
                        }
                    }
                }else{
                    if(intF==3){
                        if (intCh == 0){
                            tv_first.text = "Happy birthday"
                            tv_second.text = "«Happy Birthday to You» (с англ. — «С днём рождения тебя») — песня, исполняющаяся как приветственное поздравление с днём рождения. Песня переведена на многие языки, хотя часто исполняется на английском языке даже в тех странах, где английский не является основным языком. Книга рекордов Гиннесса называет «Happy Birthday to You» самой известной песней на английском языке, после которой идёт «For He’s a Jolly Good Fellow»ruen («Он — весёлый парень»).\n" +
                                    "\n" +
                                    "По традиции, песню «Happy Birthday to You» поют гости на праздновании дня рождения, приветствуя именинника. Зачастую это сопровождается вручением торта с зажжёнными свечами."
                        }else{
                            if (intCh == 1){
                                tv_first.text = "Married day"
                                tv_second.text = "World Marriage Day is an observance sponsored by American organization Worldwide Marriage Encounter,[1] associated with the Catholic Marriage Encounter movement[2] and observed on second Sunday of February each year.[3][4]\n" +
                                        "\n" +
                                        "Its purpose is declared to be: \"World Marriage Day honors husband and wife as the foundation of the family, the basic unit of society. It salutes the beauty of their faithfulness, sacrifice and joy in daily married life.\"[5]"
                            }else{
                              tv_first.text = "One work day"
                                tv_second.text = "Log in to Workday, WashU's integrated administrative system for human resources and finance as of July 1, 2021. Workday replaces legacy systems HRMS and AIS/FIS. \n" +
                                        "\n" +
                                        "Workday is where employees can perform self-service activities such as requesting time off, viewing their payslip, electing benefits and updating personal information. Managers can use Workday to manage their teams, including approving time entries and time off requests. Faculty also can use Workday for employee self-service, manager self-service and financial oversight of research grants.\n" +
                                        "\n" +
                                        "Other notable changes:\n" +
                                        "\n" +
                                        "Marketplace transactions are now initiated through Workday.\n" +
                                        "Bear Bucks and university giving via payroll deduction, previously available in HRMS, are not accessible via Workday. You can access both of those actions by searching in ONE.\n" +
                                        "For research reporting, Workday will replace the FFR (Faculty Finance Reporting) tool. "
                            }
                        }
                    }else{
                        if(intF==4){
                            if (intCh == 0){
                                tv_first.text = "Samsung"
                                tv_second.text = "Характеристики Samsung UE50RU7100UXCE 125 см черный\n" +
                                        "Общие\n" +
                                        "ТипLED-телевизор\n" +
                                        "Диагональ50 дюйм\n" +
                                        "Формат экрана16:9\n" +
                                        "Разрешение3840x2160\n" +
                                        "Поддержка HD4K UHD\n" +
                                        "Светодиодная (LED) подсветкаесть\n" +
                                        "Доступ в интернет (Smart TV)да\n" +
                                        "Изогнутый экраннет\n" +
                                        "Изображение и мультимедиа\n" +
                                        "Частота обновления100 Гц\n" +
                                        "Прогрессивная разверткада\n" +
                                        "Особенности изображениятелетекст\n" +
                                        "Поддерживаемые форматы мультимедиаMP3, WMA, MPEG4, MKV, JPEG, HEVC (H.265)\n" +
                                        "Звук\n" +
                                        "Мощность звука20 Вт\n" +
                                        "Акустическая системадва динамика\n" +
                                        "Сабвуфернет\n" +
                                        "Дополнительные возможности звукастереозвук NICAM, объемное звучание\n" +
                                        "Прием сигнала\n" +
                                        "Стандарты телевиденияDVB-T MPEG4, DVB-T2, DVB-C MPEG4, DVB-S, DVB-S2\n" +
                                        "Интерфейсы\n" +
                                        "Wi-Fiда\n" +
                                        "Беспроводная передача данныхDLNA, Miracast\n" +
                                        "ВходыAV, компонентный, HDMI x3, USB x2, Ethernet (RJ-45), Bluetooth, Wi-Fi, Miracast\n" +
                                        "Выходыоптический\n" +
                                        "Функции\n" +
                                        "Режимы и функцииподдержка 24p True Cinema, таймер сна, защита от детей\n" +
                                        "Поддержка Skypeнет\n" +
                                        "Веб-камеранет\n" +
                                        "Управлениеуниверсальный (мультибрендовый) пульт\n" +
                                        "Потребляемая мощность145 Вт\n" +
                                        "Возможность крепления на стенуда\n" +
                                        "Размеры с подставкой (ШxВxГ)1124.8x728.8x261.3 мм\n" +
                                        "Вес с подставкой13.9 кг\n" +
                                        "Размеры без подставки (ШxВxГ)1124.8x650.2x59.1 мм\n" +
                                        "Вес без подставки13.6 кг\n" +
                                        "Цветчерный\n" +
                                        "Дополнительная информацияMotion Rate 100 Гц, Picture Quality Index 1400 Гц, тип затемнения UHD Dimming"
                            }else{
                                if (intCh == 1){
                                    tv_first.text = "LG"
                                    tv_second.text = "* Цены, акции и наличие могут варьироваться в зависимости от магазина и онлайн. Цены могут быть изменены без предварительного уведомления. Количество ограничено. Уточните у местных продавцов окончательную цену и наличие.\n" +
                                            "Просмотрите все компьютерные мониторы LG, включая: Узнайте обо всех удивительных характеристиках, доступных в мониторах LG UltraWide™ включая: Формат изображения UltraWide™ 21:9: настолько погрузит Вас в события на экране, что Вы почувствуете, что Вы - часть происходящего. Когда наступает время работы, ультраширокие мониторы UltraWide™ облегчат возможность просматривать несколько документов одновременно - больше не нужно переключаться между ними. IPS Мониторы: Передавая реалистичные цвета, компьютерные IPS мониторы уменьшают потерю насыщенности цвета и сохраняют цвета насыщенными, фактически под любым углом просмотра. Светодиодная подсветка обеспечивает глубокие уровни черного цвета и насыщенные цвета для удивительного контраста и детализации. LED-мониторы — наиболее востребованный и технологически совершенный на сегодняшний день вид мониторов для компьютерной техники. Он представляет собой жидкокристаллическую матрицу, которая подсвечивается светодиодами, тогда как в более ранних моделях источником подсветки были лампы CCFL. >Телевизионные Мониторы: Просматривайте развлекательный контент в Full HD 1080p по телевизору или используя Ваш компьютер. С такими особенностями как встроенный цифровой тюнер и объемный звук Dolby Surround , телевизионные мониторы LG смогут оживить Ваши любимые фильмы и сериалы, вместе с Вашим любимым онлайн-контентом и играми. Узнайте о последних инновациях в производительности и технологиях с телевизионными и компьютерными мониторами от LG, включая 4K, UltraWide™, IPS, LED и других. Посмотрите, как мы делаем жизнь лучше."
                                }else{
                                    tv_first.text = "Artel"
                                    tv_second.text = "Телевизор Artel TV LED Slim S9000 65\" Smart\n" +
                                            "\n" +
                                            "Диагональ экрана телевизора Artel TV LED Slim S9000 65\" Smart составляет 65 дюймов. Этого достаточно для того, чтобы вы смогли насладиться просмотром любимых фильмов, телепередач и спортивных трансляций. Благодаря высокому разрешению в 3840х2160 пикселей (4K Ultra HD) эта модель воспроизводит невероятно четкое изображение. Разработчики предусмотрели в этой модели встроенный модуль Wi-Fi и функцию Smart TV. Теперь вы сможете просматривать видеоролики и веб-страницы в сети Интернет. Матрица его выполнена на базе технологии LED, обеспечивающей равномерную подсветку всех участков дисплея.\n" +
                                            "\n" +
                                            "Две колонки общей мощностью 24 Вт воспроизводят качественный и объемный звук, за счет чего вы сможете погрузиться в события, происходящие на экране. В этой модели поддерживаются стандарты вещания DVB-T, DVB-C, DVB-S и DVB-S2, поэтому вы сможете подключить кабельное, эфирное и спутниковое ТВ. Также в ней предусмотрена функция Time Shift. На задней панели телевизора имеются четыре входа HDMI и два USB-порта. В комплекте к нему прилагается пульт дистанционного управления, с помощью которого вы сможете переключать каналы не вставая с дивана или кресла.\n" +
                                            "\n" +
                                            "Приобрести телевизор Artel TV LED Slim S9000 65\" Smart вы можете в нашем интернет магазине MEDIAPARK.UZ.\n" +
                                            "\n" +
                                            "\n" +
                                            "*Характеристики и комплектация могут быть изменены\n" +
                                            "фирмой-производителем без предварительного уведомления"
                                }
                            }
                        }else{
                            if(intF==5){
                                if (intCh == 0){
                                    tv_first.text = "Kettle"
                                    tv_second.text = "A kettle, sometimes called a tea kettle or teakettle, is a type of pot specialized for boiling water, commonly with a lid, spout, and handle, or a small electric kitchen appliance of similar shape that functions in a self-contained manner. Kettles can be heated either by placing on a stove, or by their own internal electric heating element in the appliance versions. As indicated by its name, the kettle was and is often used as teaware to brew tea or prepare a tisane. Some very modern versions do more than just boil water, and also make the tea and keep it warm." +
                                            "In countries with 200–240 V mains electricity, electric kettles are commonly used to boil water without the necessity of a stove top. The Slovick, or heating element, is typically fully enclosed, with a power rating of 2–3 kW. This means that the current draw for an electric kettle is up to 13 A, which is a sizeable proportion of the current available for many homes: the main fuse of most homes varies between 20 and 100 amps. In countries with 120 V mains electricity twice as much current is drawn for the same power. In some of those countries electric kettles, while available, are less popular since most electric sockets are current limited to providing around 1.5 kW and kettles heat much more slowly.[3][4][5]\n" +
                                            "\n" +
                                            "In modern designs, once the water has reached boiling point, the kettle automatically deactivates, preventing the water from boiling away and damaging the heating element.[6][7][8] A more upright design, the \"jug\"-style electrical kettle, can be more economical to use, since even one cup of water will keep the element covered.[citation needed]\n" +
                                            "\n" +
                                            "In the United States, an electric kettle may sometimes be referred to as a hot pot."
                                }else{
                                    if (intCh == 1){
                                        tv_first.text = "Microwave"
                                        tv_second.text = "Microwave is a form of electromagnetic radiation with wavelengths ranging from about one meter to one millimeter corresponding to frequencies between 300 MHz and 300 GHz respectively.[1][2][3][4][5] Different sources define different frequency ranges as microwaves; the above broad definition includes both UHF and EHF (millimeter wave) bands. A more common definition in radio-frequency engineering is the range between 1 and 100 GHz (wavelengths between 0.3 m and 3 mm).[2] In all cases, microwaves include the entire SHF band (3 to 30 GHz, or 10 to 1 cm) at minimum. Frequencies in the microwave range are often referred to by their IEEE radar band designations: S, C, X, Ku, K, or Ka band, or by similar NATO or EU designations.\n" +
                                                "\n" +
                                                "The prefix micro- in microwave is not meant to suggest a wavelength in the micrometer range. Rather, it indicates that microwaves are \"small\" (having shorter wavelengths), compared to the radio waves used prior to microwave technology. The boundaries between far infrared, terahertz radiation, microwaves, and ultra-high-frequency radio waves are fairly arbitrary and are used variously between different fields of study.\n" +
                                                "\n" +
                                                "Microwaves travel by line-of-sight; unlike lower frequency radio waves they do not diffract around hills, follow the earth's surface as ground waves, or reflect from the ionosphere, so terrestrial microwave communication links are limited by the visual horizon to about 40 miles (64 km). At the high end of the band, they are absorbed by gases in the atmosphere, limiting practical communication distances to around a kilometer. Microwaves are widely used in modern technology, for example in point-to-point communication links, wireless networks, microwave radio relay networks, radar, satellite and spacecraft communication, medical diathermy and cancer treatment, remote sensing, radio astronomy, particle accelerators, spectroscopy, industrial heating, collision avoidance systems, garage door openers and keyless entry systems, and for cooking food in microwave ovens."
                                    }else{
                                        tv_first.text = "Toaster"
                                        tv_second.text = "In pop-up or automatic toasters, a single vertical piece of bread is dropped into a slot on the top of the toaster. A lever on the side of the toaster is pressed down, lowering the bread into the toaster and activating the heating elements. The length of the toasting cycle (and therefore the degree of toasting) is adjustable via a lever, knob, or series of pushbuttons, and when an internal device determines that the toasting cycle is complete, the toaster turns off and the toast pops up out of the slots.\n" +
                                                "\n" +
                                                "The completion of toasting may be determined by timer or by a thermal sensor, such as a bimetallic strip, located close to the toast.[citation needed]\n" +
                                                "\n" +
                                                "Toasters may also be used to toast other foods such as teacakes, toaster pastry, potato waffles and crumpets, though resultant accumulation of fat and sugar inside the toaster can contribute to its eventual failure.\n" +
                                                "\n" +
                                                "Among pop-up toasters, those toasting two slices of bread are more purchased than those which can toast four.[1] Pop-up toasters can have a range of appearances beyond just a square box, and may have an exterior finish of chrome, copper, brushed metal, or any color plastic.[1] The marketing and price of toasters may not be an indication of quality for producing good toast.[1] A typical modern two-slice pop-up toaster can draw from 600 to 1200 watts.[2]\n" +
                                                "\n" +
                                                "Beyond the basic toasting function, some pop-up toasters offer additional features such as:\n" +
                                                "\n" +
                                                "One-sided toasting, which some people prefer when toasting bagels\n" +
                                                "The ability to power the heat elements in only one of the toaster's several slots\n" +
                                                "Slots of various depth, length, and width to accommodate a variety of bread types\n" +
                                                "Provisions to allow the bread to be lifted higher than the normal raised position, so toast that has shifted during the toasting process can safely and easily be removed\n" +
                                                "Toaster oven\n" +
                                                "Toaster ovens are small electric ovens that provide toasting capability plus a limited amount of baking and broiling capability. They are especially useful when the users do not also have a kitchen stove with an integral oven, such as in smaller apartments and in recreational vehicles such as truck campers."
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

 }
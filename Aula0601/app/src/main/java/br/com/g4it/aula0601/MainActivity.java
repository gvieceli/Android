package br.com.g4it.aula0601;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.Toast;
import android.content.SharedPreferences.Editor;

public class MainActivity extends Activity {

    ListView lv;
    Toast t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.nomeProduto);

        adapterBase();

    }

    private void adapterBase() {

        List<Produto> list = new ArrayList<Produto>();

        list.add(new Produto("001", "Kionex", "$79.23"));
        list.add(new Produto("002", "Viscum 10", "$6.84"));
        list.add(new Produto("003", "DOUBLE PERFECTION LUMIERE", "$74.67"));
        list.add(new Produto("004", "Sunmark Adult Tussin", "$42.34"));
        list.add(new Produto("005", "Paroxetine", "$30.48"));
        list.add(new Produto("006", "Hydrogen Peroxide", "$64.43"));
        list.add(new Produto("007", "Black Oak", "$60.40"));
        list.add(new Produto("008", "Quetiapine fumarate", "$21.75"));
        list.add(new Produto("009", "Potassium Chloride", "$18.74"));
        list.add(new Produto("010", "Pentoxifylline", "$96.07"));
        list.add(new Produto("011", "Senna- S", "$4.12"));
        list.add(new Produto("012", "Theophylline", "$99.39"));
        list.add(new Produto("013", "Divalproex Sodium", "$91.30"));
        list.add(new Produto("014", "Antiseptic", "$31.73"));
        list.add(new Produto("015", "CALMS FORTE", "$19.00"));
        list.add(new Produto("016", "Levothyroxine sodium", "$64.43"));
        list.add(new Produto("017", "Dexamethasone sodium phosphate", "$72.19"));
        list.add(new Produto("018", "Metoprolol Tartrate", "$94.06"));
        list.add(new Produto("019", "Ibuprofen", "$80.82"));
        list.add(new Produto("020", "Bio Rock Rose", "$70.52"));
        list.add(new Produto("021", "Neosporin Plus Pain Relief", "$81.07"));
        list.add(new Produto("022", "AK-Con", "$66.37"));
        list.add(new Produto("023", "Fleet", "$32.96"));
        list.add(new Produto("024", "TERUFLEX Blood Bag System Anticoagulant Citrate Phosphate Dextrose (CPD) AND OPTISOL Red Cell Preservative", "$46.19"));
        list.add(new Produto("025", "STOOL SOFTENER", "$59.60"));
        list.add(new Produto("026", "Pain Relief", "$46.27"));
        list.add(new Produto("027", "Pramipexole Dihydrochloride", "$15.81"));
        list.add(new Produto("028", "OXYCODONE AND ACETAMINOPHEN", "$47.93"));
        list.add(new Produto("029", "Acyclovir", "$6.35"));
        list.add(new Produto("030", "Isopropyl Rubbing Alcohol", "$16.41"));
        list.add(new Produto("031", "quetiapine fumarate", "$61.77"));
        list.add(new Produto("032", "Denavir", "$89.60"));
        list.add(new Produto("033", "PreviDent", "$49.64"));
        list.add(new Produto("034", "Flecainide Acetate", "$74.95"));
        list.add(new Produto("035", "meloxicam", "$72.64"));
        list.add(new Produto("036", "EROS BODYGLIDE", "$51.15"));
        list.add(new Produto("037", "TRANZGEL", "$39.75"));
        list.add(new Produto("038", "Procardia", "$77.74"));
        list.add(new Produto("039", "pain relief", "$31.62"));
        list.add(new Produto("040", "Levetiracetam", "$53.42"));
        list.add(new Produto("041", "TRETIN.X", "$34.37"));
        list.add(new Produto("042", "original", "$24.78"));
        list.add(new Produto("043", "Bronkids", "$43.16"));
        list.add(new Produto("044", "Wal-phed", "$40.46"));
        list.add(new Produto("045", "Clindamycin", "$93.82"));
        list.add(new Produto("046", "Ignatia amara", "$77.71"));
        list.add(new Produto("047", "Dog Fennel", "$61.27"));
        list.add(new Produto("048", "TROSPIUM CHLORIDE", "$34.77"));
        list.add(new Produto("049", "pain relief", "$73.00"));
        list.add(new Produto("050", "Pure Transformation Sheer Fair", "$43.30"));
        list.add(new Produto("051", "AQUALUMIERE", "$51.35"));
        list.add(new Produto("052", "Nystatin", "$88.71"));
        list.add(new Produto("053", "Diazepam", "$54.46"));
        list.add(new Produto("054", "SEREVENT", "$66.33"));
        list.add(new Produto("055", "Betaxolol", "$54.39"));
        list.add(new Produto("056", "cephalexin", "$5.53"));
        list.add(new Produto("057", "SOMA Hyulgihwan Gold", "$33.33"));
        list.add(new Produto("058", "Kendall 2-in-1 Cleanser", "$55.37"));
        list.add(new Produto("059", "Antiseptic", "$68.30"));
        list.add(new Produto("060", "Ximino", "$87.27"));
        list.add(new Produto("061", "Scrub-In Surgical Scrub Brush/Sponge", "$77.12"));
        list.add(new Produto("062", "Head and Shoulders Treatment", "$66.61"));
        list.add(new Produto("063", "SolMate", "$35.08"));
        list.add(new Produto("064", "Carvedilol", "$17.59"));
        list.add(new Produto("065", "Gemfibrozil", "$51.54"));
        list.add(new Produto("066", "Australian Gold", "$65.09"));
        list.add(new Produto("067", "Rimmel London", "$29.31"));
        list.add(new Produto("068", "SH 18 Whitening", "$89.10"));
        list.add(new Produto("069", "DG Health nasal decongestant pe", "$64.22"));
        list.add(new Produto("070", "QCare", "$39.07"));
        list.add(new Produto("071", "Restless Mind", "$71.05"));
        list.add(new Produto("072", "Cladosporium cladosporioides", "$50.68"));
        list.add(new Produto("073", "Ropinirole Hydrochloride", "$79.43"));
        list.add(new Produto("074", "Medpride", "$22.20"));
        list.add(new Produto("075", "Stona-S", "$14.99"));
        list.add(new Produto("076", "Perphenazine", "$95.89"));
        list.add(new Produto("077", "Calcium Chloride", "$95.79"));
        list.add(new Produto("078", "Terazosin hydrochloride", "$96.80"));
        list.add(new Produto("079", "Testim", "$42.40"));
        list.add(new Produto("080", "Doxazosin", "$32.29"));
        list.add(new Produto("081", "Nighttime D", "$44.93"));
        list.add(new Produto("082", "Anastrozole", "$91.14"));
        list.add(new Produto("083", "Zolmitriptan", "$64.44"));
        list.add(new Produto("084", "Gold Bond Ultimate Eczema Relief", "$22.94"));
        list.add(new Produto("085", "Gabapentin", "$43.24"));
        list.add(new Produto("086", "Temazepam", "$26.24"));
        list.add(new Produto("087", "Nystatin", "$27.07"));
        list.add(new Produto("088", "Rhizopus oryzae", "$34.70"));
        list.add(new Produto("089", "Hydrocodone Bitartrate and Acetaminophen", "$69.68"));
        list.add(new Produto("090", "Bupropion Hydrochloride", "$43.94"));
        list.add(new Produto("091", "Laura Mercier Tinted Moisturizer SPF 20 TAWNY", "$33.95"));
        list.add(new Produto("092", "CHLORZOXAZONE", "$26.02"));
        list.add(new Produto("093", "CY BETTER LIPS BALM Humectante para Labios con color FPS 18", "$13.65"));
        list.add(new Produto("094", "Nitroglycerin", "$6.02"));
        list.add(new Produto("095", "Wicked Candy Apple Antibacterial Hand", "$93.70"));
        list.add(new Produto("096", "Docusate Sodium", "$24.38"));
        list.add(new Produto("097", "MUSCLE CRAMPS", "$49.62"));
        list.add(new Produto("098", "Metronidazole", "$69.26"));
        list.add(new Produto("099", "Antihistamine Allergy", "$65.95"));
        list.add(new Produto("100", "Butrans", "$59.43"));
        list.add(new Produto("101", "CAPTOPRIL", "$17.39"));
        list.add(new Produto("102", "HepaGam B", "$84.80"));
        list.add(new Produto("103", "Amiodarone Hydrochloride", "$86.48"));
        list.add(new Produto("104", "Ambien", "$7.97"));
        list.add(new Produto("105", "Pleo Alb", "$71.97"));
        list.add(new Produto("106", "Be gone Insomnia", "$92.47"));
        list.add(new Produto("107", "Nitrous Oxide", "$41.81"));
        list.add(new Produto("108", "TopCare day time severe cold and cough", "$30.24"));
        list.add(new Produto("109", "Benazepril Hydrochloride", "$30.90"));
        list.add(new Produto("110", "Methadone Hydrochloride", "$3.41"));
        list.add(new Produto("111", "Peter Island Continuous Sport Sunscreen", "$30.21"));
        list.add(new Produto("112", "Fenofibric Acid", "$33.13"));
        list.add(new Produto("113", "Ketotifen Fumarate", "$43.92"));
        list.add(new Produto("114", "TOPCARE", "$95.69"));
        list.add(new Produto("115", "Black Locust", "$47.16"));
        list.add(new Produto("116", "BORAX", "$48.05"));
        list.add(new Produto("117", "Sardine", "$46.75"));
        list.add(new Produto("118", "Sulfamethoxazole and Trimethoprim", "$25.72"));
        list.add(new Produto("119", "Flumazenil", "$32.63"));
        list.add(new Produto("120", "Daytime PE Nitetime", "$36.04"));
        list.add(new Produto("121", "Cefuroxime Axetil", "$18.25"));
        list.add(new Produto("122", "Levothyroxine Sodium", "$11.61"));
        list.add(new Produto("123", "White Fish", "$80.11"));
        list.add(new Produto("124", "Phoma glomerata", "$85.81"));
        list.add(new Produto("125", "Corlopam", "$40.46"));
        list.add(new Produto("126", "Giorgio Armani Regenessence High Lift Muti Firming Rejuvenating Broad Spectrum SPF 15 Sunscreen", "$86.00"));
        list.add(new Produto("127", "Natures Gate", "$71.51"));
        list.add(new Produto("128", "Salex", "$57.70"));
        list.add(new Produto("129", "Omeprazole", "$75.94"));
        list.add(new Produto("130", "Primer", "$55.70"));
        list.add(new Produto("131", "Complete Care Tartar Control", "$87.34"));
        list.add(new Produto("132", "flormar REBORN BB SUNSCREEN BROAD SPECTRUM SPF 30 CP27 Capuccino", "$53.15"));
        list.add(new Produto("133", "Acetaminophen And Codeine", "$48.73"));
        list.add(new Produto("134", "Pain Relief", "$38.56"));
        list.add(new Produto("135", "Hydrocodone Bitartrate and Acetaminophen", "$34.21"));
        list.add(new Produto("136", "Moxifloxacin", "$3.43"));
        list.add(new Produto("137", "Lorazepam", "$80.12"));
        list.add(new Produto("138", "Levothyroxine Sodium", "$69.23"));
        list.add(new Produto("139", "BENZONATATE", "$38.26"));
        list.add(new Produto("140", "Desipramine Hydrochloride", "$15.31"));
        list.add(new Produto("141", "napoleon PERDIS AUTO PILOT BBB CREAM BROAD SPECTRUM SPF 30 LIGHT-MEDIUM", "$26.00"));
        list.add(new Produto("142", "Metoprolol Tartrate", "$53.73"));
        list.add(new Produto("143", "day relief", "$47.29"));
        list.add(new Produto("144", "LORTAB", "$81.09"));
        list.add(new Produto("145", "Ceftazidime", "$75.39"));
        list.add(new Produto("146", "Se-Tan DHA", "$50.57"));
        list.add(new Produto("147", "Technetium Tc99m Generator", "$88.47"));
        list.add(new Produto("148", "American Elm", "$17.39"));
        list.add(new Produto("149", "DR. RECKEWEG R7 Hepagalen", "$25.64"));
        list.add(new Produto("150", "Nystatin", "$59.35"));
        list.add(new Produto("151", "Cultivated Rye", "$71.89"));
        list.add(new Produto("152", "Diazepam", "$46.68"));
        list.add(new Produto("153", "Warfarin Sodium", "$19.14"));
        list.add(new Produto("154", "Spironolactone", "$31.00"));
        list.add(new Produto("155", "Lorazepam", "$26.60"));
        list.add(new Produto("156", "LUVENA FEMININE WIPES", "$86.81"));
        list.add(new Produto("157", "diphenhydramine hcl and zinc acetate", "$66.74"));
        list.add(new Produto("158", "Bottlebrush Pollen", "$61.11"));
        list.add(new Produto("159", "Purminerals 4 in 1 Makeup SPF 15 Dark", "$14.17"));
        list.add(new Produto("160", "Fast Freeze", "$64.39"));
        list.add(new Produto("161", "Chlorpromazine Hydrochloride", "$19.96"));
        list.add(new Produto("162", "EQUALINE", "$53.59"));
        list.add(new Produto("163", "Aspergillus repens", "$92.28"));
        list.add(new Produto("164", "Phenytoin Sodium", "$76.48"));
        list.add(new Produto("165", "Be gone Poison Ivy", "$13.75"));
        list.add(new Produto("166", "West Wheat Grass", "$86.99"));
        list.add(new Produto("167", "KAISER PERMANENTE", "$84.80"));
        list.add(new Produto("168", "LAVIV", "$52.69"));
        list.add(new Produto("169", "ITCH-X", "$21.82"));
        list.add(new Produto("170", "Cesamet", "$13.22"));
        list.add(new Produto("171", "BETAMETHASONE CLOTRIMAZOLE", "$14.50"));
        list.add(new Produto("172", "Topex", "$86.26"));
        list.add(new Produto("173", "FACE IT RADIANCE POWDER PACT SPF25 MOISTURE VEIL NB17", "$59.72"));
        list.add(new Produto("174", "Rimmel London", "$5.90"));
        list.add(new Produto("175", "Zolpidem Tartrate", "$12.01"));
        list.add(new Produto("176", "Citalopram Hydrobromide", "$9.13"));
        list.add(new Produto("177", "Protamine Sulfate", "$61.70"));
        list.add(new Produto("178", "ANTISEPTIC SKIN CLEANSER", "$26.20"));
        list.add(new Produto("179", "Pleo Leptu", "$37.95"));
        list.add(new Produto("180", "SHISEIDO RADIANT LIFTING FOUNDATION", "$62.70"));
        list.add(new Produto("181", "GRANIX", "$65.02"));
        list.add(new Produto("182", "Cyclosporine", "$92.11"));
        list.add(new Produto("183", "Hydrocodone Bitartrate and Acetaminophen", "$57.02"));
        list.add(new Produto("184", "Potassium Chloride", "$77.81"));
        list.add(new Produto("185", "Ring Relief", "$14.53"));
        list.add(new Produto("186", "Pollens - Trees, Palo Verde Cercidium floridum", "$29.82"));
        list.add(new Produto("187", "Peach", "$17.91"));
        list.add(new Produto("188", "Nabumetone", "$66.43"));
        list.add(new Produto("189", "Furosemide", "$26.49"));
        list.add(new Produto("190", "leader nite time cough", "$97.35"));
        list.add(new Produto("191", "PredniSONE", "$93.17"));
        list.add(new Produto("192", "GOOD NEIGHBOR PHARMACY LUBRICANT EYE DROPS", "$7.25"));
        list.add(new Produto("193", "Glycerin", "$88.52"));
        list.add(new Produto("194", "Depo-SubQ Provera", "$19.97"));
        list.add(new Produto("195", "Doxycycline", "$33.67"));
        list.add(new Produto("196", "Dove IS Powder", "$17.60"));
        list.add(new Produto("197", "Diltiazem Hydrochloride", "$58.45"));
        list.add(new Produto("198", "Terazosin", "$35.19"));
        list.add(new Produto("199", "Oxycodone Hydrochloride", "$71.00"));
        list.add(new Produto("200", "Quetiapine fumarate", "$28.99"));
        list.add(new Produto("201", "hair regrowth treatment", "$55.38"));
        list.add(new Produto("202", "EYE - CATARACT", "$67.18"));
        list.add(new Produto("203", "Hydrocortisone and Acetic Acid", "$45.92"));
        list.add(new Produto("204", "Cocoa Butter", "$13.74"));
        list.add(new Produto("205", "Givenchy Photo Perfexion Fluid Foundation Broad Spectrum SPF 20 Perfect Beige", "$40.44"));
        list.add(new Produto("206", "Aptiom", "$96.84"));
        list.add(new Produto("207", "EROS EXPLORER", "$59.30"));
        list.add(new Produto("208", "Velvet Grass", "$41.66"));
        list.add(new Produto("209", "The21 DAYs HAIR NUTRIENT SERUM", "$3.74"));
        list.add(new Produto("210", "family wellness laxative", "$57.78"));
        list.add(new Produto("211", "Estazolam", "$45.11"));
        list.add(new Produto("212", "Medicated", "$85.26"));
        list.add(new Produto("213", "FERRUM PHOSPHORICUM", "$24.64"));
        list.add(new Produto("214", "Losartan Potassium and Hydrochlorothiazide", "$56.42"));
        list.add(new Produto("215", "VENLAFAXINE HYDROCHLORIDE", "$84.83"));
        list.add(new Produto("216", "Treatment Set TS347249", "$43.53"));
        list.add(new Produto("217", "Sertraline Hydrochloride", "$66.59"));
        list.add(new Produto("218", "Buprenorphine HCl and Naloxone HCl", "$11.49"));
        list.add(new Produto("219", "GlucaGen HypoKit", "$32.52"));
        list.add(new Produto("220", "ZOLPIDEM TARTRATE", "$31.60"));
        list.add(new Produto("221", "Headache Relief", "$85.82"));
        list.add(new Produto("222", "Oxygen", "$21.10"));
        list.add(new Produto("223", "Ropinirole Hydrochloride", "$24.67"));
        list.add(new Produto("224", "LES BEIGES", "$16.36"));
        list.add(new Produto("225", "Urban Decay Naked Skin Beauty Balm SPF 20", "$37.56"));
        list.add(new Produto("226", "Flawless Finish Dual Perfection Makeup SPF 8 Cameo", "$95.32"));
        list.add(new Produto("227", "Hand Sanitizer", "$91.50"));
        list.add(new Produto("228", "Saline Laxative", "$4.02"));
        list.add(new Produto("229", "Cardizem", "$27.70"));
        list.add(new Produto("230", "PROPOXYPHENE NAPSYLATE AND ACETAMINOPHEN", "$87.03"));
        list.add(new Produto("231", "Simvastatin", "$77.18"));
        list.add(new Produto("232", "CLARINS Ever Matte Broad Spectrum SPF 15 Tint 110", "$65.73"));
        list.add(new Produto("233", "Cefuroxime Axetil", "$76.19"));
        list.add(new Produto("234", "take cover anti-aging foundation", "$60.34"));
        list.add(new Produto("235", "CareOne 7-in-1 Anti-Aging Vitamin", "$78.49"));
        list.add(new Produto("236", "Alendronate Sodium", "$50.27"));
        list.add(new Produto("237", "Darkleaves Mugwort", "$75.47"));
        list.add(new Produto("238", "Pain-A-Trate", "$46.81"));
        list.add(new Produto("239", "Cough and Cold", "$90.46"));
        list.add(new Produto("240", "RISPERIDONE", "$58.93"));
        list.add(new Produto("241", "Timeless EGF Power Eye", "$81.89"));
        list.add(new Produto("242", "Risperidone", "$97.91"));
        list.add(new Produto("243", "Levetiracetam", "$54.19"));
        list.add(new Produto("244", "Mosquito", "$46.72"));
        list.add(new Produto("245", "Homeopathic Ringing Ear Formula", "$18.48"));
        list.add(new Produto("246", "Ivory", "$54.46"));
        list.add(new Produto("247", "Torsemide", "$17.90"));
        list.add(new Produto("248", "Lipitor", "$22.47"));
        list.add(new Produto("249", "Ibuprofen", "$85.23"));
        list.add(new Produto("250", "benzphetamine hydrochloride", "$44.73"));
        list.add(new Produto("251", "Bacteria", "$71.70"));
        list.add(new Produto("252", "RANITIDINE", "$65.03"));
        list.add(new Produto("253", "Quinapril Hydrochloride and Hydrochlorothiazide", "$33.55"));
        list.add(new Produto("254", "Date", "$14.05"));
        list.add(new Produto("255", "Lysol", "$46.49"));
        list.add(new Produto("256", "Budesonide", "$16.47"));
        list.add(new Produto("257", "AMLODIPINE BESYLATE", "$38.16"));
        list.add(new Produto("258", "HairQ", "$87.72"));
        list.add(new Produto("259", "Rejuvenation", "$58.46"));
        list.add(new Produto("260", "HAND SANITIZER", "$68.18"));
        list.add(new Produto("261", "Childrens Cough Symptom Formula", "$26.46"));
        list.add(new Produto("262", "Serotonin", "$37.56"));
        list.add(new Produto("263", "Coralite ALCOHOL PADS", "$14.98"));
        list.add(new Produto("264", "Antiseptic Mouth Rinse", "$9.80"));
        list.add(new Produto("265", "PRAVASTATIN SODIUM", "$65.47"));
        list.add(new Produto("266", "Phenylephrine Hydrochloride", "$89.71"));
        list.add(new Produto("267", "Winter Vanilla Hand Sanitizer", "$37.86"));
        list.add(new Produto("268", "BETHANECHOL CHLORIDE", "$27.70"));
        list.add(new Produto("269", "VERELAN PM", "$32.30"));
        list.add(new Produto("270", "Hydrocodone Bitartrate and Acetaminophen", "$86.08"));
        list.add(new Produto("271", "Proactiv Solution Deep Cleansing Wash", "$66.11"));
        list.add(new Produto("272", "Fluticasone Propionate", "$66.06"));
        list.add(new Produto("273", "Hepataforce", "$12.38"));
        list.add(new Produto("274", "Fluoxetine", "$16.78"));
        list.add(new Produto("275", "Stool Softener", "$68.31"));
        list.add(new Produto("276", "Hand Care Day care Broad Spectrum SPF 15", "$41.05"));
        list.add(new Produto("277", "Hair Regrowth Treatment for Women", "$29.63"));
        list.add(new Produto("278", "Simethicone", "$50.23"));
        list.add(new Produto("279", "Cotton Candy", "$48.43"));
        list.add(new Produto("280", "Secret Natural Mineral", "$48.48"));
        list.add(new Produto("281", "womans laxative", "$94.57"));
        list.add(new Produto("282", "ALAVERT ALLERGY SINUS D-12", "$24.40"));
        list.add(new Produto("283", "VERAPAMIL HYDROCHLORIDE", "$83.76"));
        list.add(new Produto("284", "Crest Pro-Health", "$5.58"));
        list.add(new Produto("285", "RESTASIS", "$40.23"));
        list.add(new Produto("286", "Oral HCG Homeopathic", "$50.81"));
        list.add(new Produto("287", "Purse Essentials hand sanitizer Anti-Bacterial Hand", "$20.89"));
        list.add(new Produto("288", "Cefdinir", "$96.94"));
        list.add(new Produto("289", "ACER NEGUNDO POLLEN", "$23.49"));
        list.add(new Produto("290", "Omeprazole", "$82.53"));
        list.add(new Produto("291", "Gambil Oak", "$79.48"));
        list.add(new Produto("292", "Lymphapar", "$94.86"));
        list.add(new Produto("293", "Chidangwon 300", "$77.20"));
        list.add(new Produto("294", "Pollens - Trees, Oak Mix", "$16.40"));
        list.add(new Produto("295", "Etodolac", "$28.71"));
        list.add(new Produto("296", "Alcohol Pad", "$12.07"));
        list.add(new Produto("297", "Renapath", "$83.65"));
        list.add(new Produto("298", "TARCEVA", "$27.99"));
        list.add(new Produto("299", "Guaifenesin", "$15.11"));
        list.add(new Produto("300", "Granisetron Hydrochloride", "$27.99"));

        ProdutoAdapter adapter = new ProdutoAdapter(getBaseContext(), list);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position,
                                    long id) {
                Produto produto = (Produto) adapter.getItemAtPosition(position);
                Toast.makeText(getBaseContext(),
                        "Selecionado: " + produto.getNome(),
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });

        lv.setOnItemLongClickListener(new OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> adapter, View view, int position,
                                           long id) {
                Produto produto_selecionado = (Produto)adapter.getItemAtPosition(position);

                if (t != null) {
                    t.cancel();
                }

                SharedPreferences prefs = getSharedPreferences("arquivoProps",
                        MODE_PRIVATE);

                String cod = produto_selecionado.getCodigo();
                String nom =  produto_selecionado.getNome();
                String prec = produto_selecionado.getPreco();

                Editor editor = prefs.edit();
                editor.putString("nomeProduto", nom);
                editor.putString("codigoProduto", cod);
                editor.putString("precoProduto", prec);
                editor.commit();

                Intent abreProd = new Intent(getBaseContext(),DetalheProduto.class);
                startActivity(abreProd);

                return true;
            }
        });

    }

}

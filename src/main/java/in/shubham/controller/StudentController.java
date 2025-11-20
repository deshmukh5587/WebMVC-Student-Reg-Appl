package in.shubham.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shubham.binding.Student;

@Controller
public class StudentController {

    @GetMapping("/")
    public String loadForm(Model model) {

        List<String> coursesList = new ArrayList<>();
        coursesList.add("Java");
        coursesList.add("DevOps");
        coursesList.add("AWS");
        coursesList.add("Python");

        List<String> timingList = new ArrayList<>();
        timingList.add("Morning");
        timingList.add("Afternoon");
        timingList.add("Evening");

        // FIRST create student object
        Student student = new Student();

        // THEN add into model
        model.addAttribute("courses", coursesList);
        model.addAttribute("timings", timingList);
        model.addAttribute("student", student);

        return "index"; // JSP page name
        
    }
    
    @PostMapping("/save")
    public String handleSubmit(StudentController s, Model model) {
    	System.out.println(s);
    	
    	model.addAttribute("msg", "Student saved");
    	return "index";
		
	}
}

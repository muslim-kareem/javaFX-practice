package com.javafx.treeView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TreeView<String> myTreeView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    //  to add icon to the Files -> new TreeItem<>("Files", new ImageView(new Image("image-path")));
        TreeItem<String> rootItem = new TreeItem<>("Files");

        TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
        TreeItem<String> leafItem1 = new TreeItem<>("Picture");
        TreeItem<String> leafItem2 = new TreeItem<>("Picture");
        branchItem1.getChildren().addAll(leafItem1,leafItem2);

        TreeItem<String> branchItem2 = new TreeItem<>("Videos");
        TreeItem<String> leafItem3 = new TreeItem<>("Video");
        TreeItem<String> leafItem4 = new TreeItem<>("Video");
        branchItem2.getChildren().addAll(leafItem3,leafItem4);


        TreeItem<String> branchItem3 = new TreeItem<>("Music");
        TreeItem<String> leafItem5 = new TreeItem<>("music1");
        TreeItem<String> leafItem6 = new TreeItem<>("music2");
        branchItem3.getChildren().addAll(leafItem5,leafItem5);




        rootItem.getChildren().addAll(branchItem1,branchItem2,branchItem3);

        myTreeView.setRoot(rootItem);

        // to hide the parent directory
//        myTreeView.setShowRoot(false);
    }

    public void selectItem(){
        TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();

        if(item != null)
        System.out.println(item.getValue());

    }
}

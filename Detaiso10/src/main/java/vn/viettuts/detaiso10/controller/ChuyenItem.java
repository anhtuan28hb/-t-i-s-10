
package vn.viettuts.detaiso10.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import vn.viettuts.detaiso10.view.dangxuatJPanel;
import vn.viettuts.detaiso10.view.danhgiaJPanel;
import vn.viettuts.detaiso10.view.helpJPanel;
import vn.viettuts.detaiso10.view.homeJPanel;
import vn.viettuts.detaiso10.view.khachhangJPanel;
import vn.viettuts.detaiso10.view.motaJPanel;
import vn.viettuts.detaiso10.view.muahangJPanel;
import vn.viettuts.detaiso10.view.sanphamJPanel;
import vn.viettuts.detaiso10.view.thongkeJPanel;


public class ChuyenItem {
    private String kind;
    private JPanel node;
    private JPanel jpnItem;
    private JButton jbtItem;
    private final JPanel root;
    private String kindSelected = "";
    private List<Menu> listitem = null;

    public ChuyenItem(JPanel jpnroot) {
        this.root = jpnroot;
    }

    public void setView(JPanel jpnitem, JButton jbtitem) {
        kindSelected = "sanpham";
        jpnitem.setBackground(new Color(96, 100, 191));
        jbtitem.setBackground(new Color(96, 100, 191));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new sanphamJPanel());
        root.repaint();
    }

    public void setEvent(List<Menu> listitem) {
        this.listitem = listitem;
        for (Menu item : listitem) {
            item.getJbt().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJbt()));
        }
    }

    class LabelEvent implements MouseListener {

        LabelEvent(String kind1, JPanel jpn, JButton jbt) {
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "sanpham":
                    node = new sanphamJPanel();
                    break;
                case "khachhang":
                    node = new khachhangJPanel();
                    break;
                case "muahang":
                    node = new muahangJPanel() ;
                    break;
                case "thongke":
                    node = new thongkeJPanel();
                    break;
                case "danhgia":
                    node = new danhgiaJPanel();
                    break;
                case "mota":
                    node = new motaJPanel();
                    break;
                case "dangxuat":
                    node = new dangxuatJPanel();
                    break;
                case "help":
                    node = new helpJPanel();
                    break;
                case "home":
                    node = new homeJPanel();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBR(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96, 100, 191));
            jbtItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96, 100, 191));
            jbtItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jbtItem.setBackground(new Color(76, 175, 80));
            }
        }

    }

    public void setChangeBR(String kind) {
        for (Menu item : listitem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(96, 100, 191));
                item.getJbt().setBackground(new Color(96, 100, 191));
            } else {
                item.getJpn().setBackground(new Color(76, 175, 80));
                item.getJbt().setBackground(new Color(76, 175, 80));
            }
        }
    }
}

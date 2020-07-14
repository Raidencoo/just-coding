package easy;

/**
 * @说明：
 * @类型名称：DefangIPaddr
 * @创建者: Raiden
 * @创建时间: 2020/7/6 14:02
 * @修改者: Raiden
 * @修改时间: 2020/7/6 14:02
 */
public class DefangIPaddr {
    /**
     * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
     * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
     */

    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
